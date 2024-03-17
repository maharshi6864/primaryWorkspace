
let waitPlayer2;
let postionWaiting;

function createServer() {
    ipAddress = document.querySelector("#id-address").value;
    track.player1Name = document.querySelector('#player1-name-server').value;
    generateOtp();
    startWaitingPlayer2();
}

function generateOtp() {
    var htp = new XMLHttpRequest();
    htp.open("POST", `http://${ipAddress}/generateid`, true);
    htp.setRequestHeader("Content-Type", "application/json")
    htp.onreadystatechange = function () {
        if (htp.readyState == 4) {
            obj = JSON.parse(htp.responseText);
            track.gameid = obj.body.data.gameid;
            alert(`Your game Id is ${track.gameid}`);
        }
    };
    var dto = {
        'player1': track.player1Name,
        'gameid': track.gameid
    }
    htp.send(JSON.stringify(dto));
}

function startWaitingPlayer2() {
    waitPlayer2 = setInterval(function () {
        console.log("waiting for player....")
        var htp = new XMLHttpRequest();
        htp.onreadystatechange = function () {
            if (htp.readyState == 4) {
                obj = JSON.parse(htp.responseText);
                gameDetails = obj.body.data;
                checkPlayer2(gameDetails);
                console.log(".");
            }
        };
        htp.open("GET", `http://${ipAddress}/player2`, true);
        htp.send();
    }, 500)

}

function checkPlayer2(gameDetails) {
    if (gameDetails.player2 !== "null") {
        clearInterval(waitPlayer2);
        console.log("interval closed")
        track.player1Name = gameDetails.player1;
        track.player2Name = gameDetails.player2;
        startGame();
    }
}

function endTrackingPlayer2(newTrack) {
    if (newTrack.player1Turn || newTrack.winDetect) {
        console.log("player 1 turn");
        console.log(newTrack);
        clearInterval(postionWaiting);
        newTrack.player1Turn = false;
        turn = true;
        console.log(newTrack.player2Position);
        document.getElementById(newTrack.player2Position).innerHTML = "X";
        document.querySelector("#player2-display-name").innerHTML = newTrack.player2Name + " : " + newTrack.player2Score;
        document.querySelector("#player1-display-name").innerHTML = newTrack.player1Name + " : " + newTrack.player1Score;
        console.log(newTrack.player2Score !== track.player2Score)
        if (newTrack.player1Score != track.player1Score || newTrack.player2Score != track.player2Score) {
            console.log("win detected from player2");
            empty();
            newTrack.winDetect = false;
        }
        if (newTrack.count == 0) {
            empty();
            track.player1Position = "d10";
            track.player2Position = "d10";
        }
        track = { ...newTrack };
    }
}

function startTrackingPlayer2() {
    postionWaiting = setInterval(function () {
        console.log("waiting for player....")
        var htp = new XMLHttpRequest();
        htp.open("GET", `http://${ipAddress}/getposition`, true);
        htp.setRequestHeader("Content-Type", "application/json");
        htp.onreadystatechange = function () {
            if (htp.readyState == 4) {
                // console.log(htp.readyState);
                obj = JSON.parse(htp.responseText);
                newtrack = obj.body.data;
                console.log(".");
                endTrackingPlayer2(newtrack);
            }
        };
        htp.send();
    }, 500)
}

function sendTrackingPlayer1() {
    turn = false;
    var htp = new XMLHttpRequest();
    htp.open("POST", `http://${ipAddress}/setposition`, true);
    htp.setRequestHeader("Content-Type", "application/json")
    htp.onreadystatechange = function () {
        if (htp.readyState == 4) {
            startTrackingPlayer2();

        }
    };
    htp.send(JSON.stringify(track));
}