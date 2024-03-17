
let waitAllowance;

function connectServer() {
    ipAddress = document.querySelector("#id-address").value;
    track.gameid = prompt("Enter Opt");
    track.player2Name = prompt("Enter your name (X)");
    joinGame();
}

function joinGame() {
    var htp = new XMLHttpRequest();
    htp.open("POST", `http://${ipAddress}/joinplayer2`, true);
    htp.setRequestHeader("Content-Type", "application/json")
    htp.onreadystatechange = function () {
        if (htp.readyState == 4) {
            startWaitingToJoinGame();
        }
    };
    var dto = {
        'player2': track.player2Name,
        'gameid': track.gameid
    }
    htp.send(JSON.stringify(dto));
}

function startWaitingToJoinGame() {
    waitAllowance = setInterval(function () {
        console.log("waiting to join.....")
        var htp = new XMLHttpRequest();
        htp.onreadystatechange = function () {
            if (htp.readyState == 4) {
                // console.log(htp.readyState);
                obj = JSON.parse(htp.responseText);
                gameDetails = obj.body.data;
                checkallowance(gameDetails);
                console.log(".");
            }
        };
        htp.open("GET", `http://${ipAddress}/player2`, true);
        htp.send();
    }, 1000)

}

function checkallowance(gameDetails) {
    if (gameDetails.player2 !== "null") {
        clearInterval(waitAllowance);
        track.player1Name = gameDetails.player1;
        track.player2Name = gameDetails.player2;
        turn = false;
        startGame();
        startTrackingPlayer1();
    }
}

function endTrackingPlayer1(newTrack) {
    if (newTrack.player2Turn || newTrack.winDetect) {
        console.log("player 2 turn");
        console.log(newTrack);
        clearInterval(postionWaiting);
        newTrack.player2Turn = false;
        turn = true;
        document.getElementById(newTrack.player1Position).innerHTML = "0";
        document.querySelector("#player2-display-name").innerHTML = newTrack.player2Name + " : " + newTrack.player2Score;
        document.querySelector("#player1-display-name").innerHTML = newTrack.player1Name + " : " + newTrack.player1Score;
        console.log(newTrack.player1Score);
        console.warn(newTrack.player1Score !== track.player1Score);
        if (newTrack.player1Score != track.player1Score || newTrack.player2Score != track.player2Score) {
            console.log("win detected from player1");
            empty();
            newTrack.winDetect = false;
            turn = false;
            track = { ...newTrack };
        }
        if (!newTrack.player2Turn) {
            clearInterval(postionWaiting);
            startTrackingPlayer1();
        }
        if (newTrack.count == 0) {
            empty();
            track.player1Position = "d10";
            track.player2Position = "d10";
        }
        track = { ...newTrack };
    }
}

function startTrackingPlayer1() {
    postionWaiting = setInterval(function () {
        console.log("waiting for player....")
        var htp = new XMLHttpRequest();
        htp.open("GET", `http://${ipAddress}/getposition`, true);
        htp.setRequestHeader("Content-Type", "application/json");
        htp.onreadystatechange = function () {
            if (htp.readyState == 4) {
                obj = JSON.parse(htp.responseText);
                newtrack = obj.body.data;
                console.log(".");
                endTrackingPlayer1(newtrack);
            }
        };
        htp.send();
    }, 1000)
}

function sendTrackingPlayer2() {
    turn = false;
    var htp = new XMLHttpRequest();
    htp.open("POST", `http://${ipAddress}/setposition`, true);
    htp.setRequestHeader("Content-Type", "application/json")
    htp.onreadystatechange = function () {
        if (htp.readyState == 4) {
            startTrackingPlayer1();
        }
    };
    htp.send(JSON.stringify(track));
}