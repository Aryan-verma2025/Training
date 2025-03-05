
let nameP1, nameP2, currentScoreEP1, currentScoreEP2, savedScoreEP1, savedScoreEP2;
let rollP1, rollP2, saveP1, saveP2;
let currentScoreP1, currentScoreP2, savedScoreP1, savedScoreP2;
let gameState;
let diceMatrix = [[0,0,0,0,1,0,0,0,0],[0,0,1,0,0,0,1,0,0],[0,0,1,0,1,0,1,0,0],[1,0,1,0,0,0,1,0,1],[1,0,1,0,1,0,1,0,1],[1,1,1,0,0,0,1,1,1]];
let winnerName;

const gameStates = {
    "Ready":0,
    "P1_turn":1,
    "P2_turn":2,
    "Won":3
}

const turns = {
    "P1":1,
    "P2":2
}

function start(){

    nameP1 = document.getElementById("nameP1");
    nameP2 = document.getElementById("nameP2");

    editNameP1 = document.getElementById("editP1");
    editNameP1 = document.getElementById("editP2");

    currentScoreEP1 = document.getElementById("currentScoreP1");
    currentScoreEP2 = document.getElementById("currentScoreP2");

    savedScoreEP1 = document.getElementById("savedScoreP1");
    savedScoreEP2 = document.getElementById("savedScoreP2");

    rollP1 = document.getElementById("rollP1");
    rollP2 = document.getElementById("rollP2");

    saveP1 = document.getElementById("saveP1");
    saveP2 = document.getElementById("saveP2");

    winnerName = document.getElementById("winnerName");

    init();
}

function init(){

    nameP1.value = "PLAYER 1";
    nameP2.value = "PLAYER 2";

    nameP1.removeAttribute("disabled");
    nameP2.removeAttribute("disabled");

    currentScoreP1 = 0;
    currentScoreP2 = 0;
    savedScoreP1 = 0;
    savedScoreP2 = 0;

    updateScore();

    gameState = gameStates.P1_turn;

    rollP1.addEventListener("click",handleRoll);
    rollP2.addEventListener("click",handleRoll);

    saveP1.addEventListener("click",handleSave);
    saveP2.addEventListener("click",handleSave);

    winnerName.innerText = "";

    updateTurn();


}

function updateScore(){
    currentScoreEP1.innerText = currentScoreP1;
    currentScoreEP2.innerText = currentScoreP2;

    savedScoreEP1.innerText = savedScoreP1;
    savedScoreEP2.innerText = savedScoreP2;
}

function rollDice(){
    let roll = Math.floor((Math.random() * 6) + 1);
    return roll;
}

function showDice(value){
    const dots = document.getElementsByClassName("dot");
    for(let i=0;i<9;i++){
        if(diceMatrix[value-1][i]==1){
            dots[i].style.backgroundColor="#b39ddb";
        }else{
            dots[i].style.backgroundColor="white";
        }
    }
}

function handleRoll(event){


    if(gameState==gameStates.Ready){
        nameP1.setAttribute("disabled","true");
        nameP2.setAttribute("disabled","true");
    }

    const roll = rollDice();

    if(roll == 1){
        if(event.target.id === "rollP1" && gameState == gameStates.P1_turn){
            currentScoreP1 = 0;
            gameState = gameStates.P2_turn;
        }else if(event.target.id === "rollP2" && gameState == gameStates.P2_turn){
            currentScoreP2 = 0;
            gameState = gameStates.P1_turn;
        }else{
            return;
        }
        updateTurn();
    }else{
        if(event.target.id === "rollP1" && gameState == gameStates.P1_turn){
            currentScoreP1 += roll;
        }else if(event.target.id === "rollP2" && gameState == gameStates.P2_turn){
            currentScoreP2 += roll;
        }else{
            return;
        }
    }
    showDice(roll);

    updateScore();
}

function handleSave(event){
    if(event.target.id == "saveP1" && gameState == gameStates.P1_turn){
        savedScoreP1 += currentScoreP1;
        currentScoreP1 = 0;
        gameState = gameStates.P2_turn;
    }else if(event.target.id == "saveP2" && gameState == gameStates.P2_turn){
        savedScoreP2 += currentScoreP2;
        currentScoreP2 = 0;
        gameState = gameStates.P1_turn;
    }
    updateScore();
    updateTurn();

    if(savedScoreP1 >= 100){
        gameState = gameStates.Won;
        winnerName.innerText = nameP1.value;
    }else if(savedScoreP2 >=100){
        gameState = gameStates.Won;
        winnerName.innerText = nameP2.value;
    }
}

function updateTurn(){
    if(gameState == gameStates.P1_turn){
        document.getElementById("player1Card").style.border='3px solid blue';
        document.getElementById("player2Card").style.border='3px solid transparent';
    }else{
        document.getElementById("player2Card").style.border='3px solid white';
        document.getElementById("player1Card").style.border='3px solid transparent';
    }
}

document.addEventListener("DOMContentLoaded", start);

