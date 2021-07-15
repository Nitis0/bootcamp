let userScore = 0;
let computerScore=0;

const userScore_span = document.getElementById("userScore");
const computerScore_span = document.getElementById("computerScore");

const scoreBoard_div = document.querySelector(".score-board");
const result_div = document.querySelector(".result");

const rock_div = document.getElementById("r");
const paper_div = document.getElementById("p");
const scissors_div = document.getElementById("s");

function getComputerChoice() {
    const choices = ['r','p','s'];
    let randomNumber = Math.floor(Math.random() * 3);
    return choices[randomNumber];
}

function convertToWord(a){
    if(a =="r") return "Rock";
    if(a == "p") return "Paper";
    return "Scissors";

}
function win(userChoice,computerChoice){
    userScore++;
    userScore_span.innerHTML = userScore;
    computerScore_span.innerHTML = computerScore;
    result_div.innerHTML = `${convertToWord(userChoice)} (User) beats ${convertToWord(computerChoice)}(Robot), You Win!!}`
}

function lose(userChoice,computerChoice){
    computerScore++;
    userScore_span.innerHTML = userScore;
    computerScore_span.innerHTML = computerScore;
    result_div.innerHTML = `${convertToWord(userChoice)} (User) loses to ${convertToWord(computerChoice)}(Robot), You Lost!!}`

function draw(userChoice,computerChoice){
    userScore_span.innerHTML = userScore;
    computerScore_span.innerHTML = computerScore;
    result_div.innerHTML = `${convertToWord(userChoice)} (User) draws with ${convertToWord(computerChoice)}(Robot), Draww!!}`

}



function game(userChoice){
     const computerChoice = getComputerChoice();
     switch(userChoice  + computerChoice){
         case "rs":
         case "sp":
         case "pr":
             win(userChoice,computerChoice);
             break;
         case "sr":
         case "ps":
         case "rp":
             lose(userChoice,computerChoice);
             break;   
         case "ss":
         case "pp":
         case "rr":
              draw(userChoice,computerChoice);
              break;                   
     }
}

main();

function main(){
    rock_div.addEventListener('click', function(){
        game("r");
        console.log("rock");
    })
    paper_div.addEventListener('click', function(){
        game("p");
    })
    scissors_div.addEventListener('click', function(){
        game("s");
    })
}
}