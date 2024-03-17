var ipAddress;
var player1_display_name = document.querySelector("#player1-display-name");
var player2_display_name = document.querySelector("#player2-display-name");
var track = {
    gameid: 0,
    count: 0,

    player1Turn: false,
    player2Turn: false,

    player1Position: "",
    player2Position: "",

    match: "         ",
    player1Sign: "0",
    player2Sign: "X",


    player1Name: "",
    player2Name: "",

    player1Score: 0,
    player2Score: 0,
    winDetect: false
};

var turn = true;
var sign = "";




function setCharAt(str, index, chr) {
    if (index > str.length - 1) return str;
    return str.substring(0, index) + chr + str.substring(index + 1);
}

function insert(cell) {
    if (track.count % 2 == 0 && cell.innerHTML == '' && turn) {
        cell.innerHTML = "0";
        console.log(track.count);
        track.count++;
        track.player1Position = cell.id;
        var postion = parseInt(cell.id[1]) - 1;
        track.match = setCharAt(track.match, postion, '0');
        console.log(track.match);
        track.player2Turn = true;
        track.player1Turn = false;
        trun = false;
        sign = "0";
        sendTrackingPlayer1()
    }
    if (track.count % 2 != 0 && cell.innerHTML == '' && turn) {
        cell.innerHTML = "X"
        console.log(track.count);
        track.count++;
        track.player2Position = cell.id;
        var postion = parseInt(cell.id[1]) - 1;
        track.match = setCharAt(track.match, postion, 'X');
        console.log(track.match);
        track.player1Turn = true;
        track.player2Turn = false;
        trun = false;
        sign = "X";
        sendTrackingPlayer2()
    }
}

function empty() {
    document.getElementById("d1").innerHTML = "";
    document.getElementById("d2").innerHTML = "";
    document.getElementById("d3").innerHTML = "";
    document.getElementById("d4").innerHTML = "";
    document.getElementById("d5").innerHTML = "";
    document.getElementById("d6").innerHTML = "";
    document.getElementById("d7").innerHTML = "";
    document.getElementById("d8").innerHTML = "";
    document.getElementById("d9").innerHTML = "";
}

function startGame() {
    document.querySelector(".score-card-body-1").style.display = "none";
    document.querySelector(".score-card-body-2").style.display = "flex";
    document.querySelector(".game-box").style.display = "flex";
    document.querySelector("#score-box").style.width = "30%";
    document.querySelector("#heading").innerHTML = "Score Card";
    document.querySelector("#player1-display-name").innerHTML = track.player1Name + " : " + track.player1Score;
    document.querySelector("#player2-display-name").innerHTML = track.player2Name + " : " + track.player2Score;
    console.log(track.gameid);
}

function savePlayer() {

    // document.getElementById("container").style.animation = "red-player1 10s";
    var name1_d = document.querySelector("#player1-input");
    var name2_d = document.querySelector("#player2-input");
    if (name1_d.value == '') {
        track.player1Name = "0";
        track.player2Name = "X";
        player1_display_name.innerHTML = "0 : ";
        player2_display_name.innerHTML = "X : ";
    } else {
        track.player1Name = name1_d.value;
        track.player1Name = name2_d.value;
        player1_display_name.innerHTML = name1_d.value;
        player2_display_name.innerHTML = name2_d.value;
    }
    startGame();
}