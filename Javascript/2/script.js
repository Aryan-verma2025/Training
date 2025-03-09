
let currentQuestionNumber = 0, score = 0;
let timer = 0;
let timerId;
let questions;
let startScreen, quizScreen, endScreen;
let questionBox, optionsArray, scoreValue;

function init(){
    startScreen = document.getElementById("startScreen");
    quizScreen = document.getElementById("quizScreen");
    endScreen = document.getElementById("endScreen");
    questionBox = document.getElementById("question");
    optionsArray = document.querySelectorAll(".quizOption p");
    scoreValue = document.getElementById("scoreValue");

    document.querySelectorAll(".quizOption p").forEach((ele)=>{
        ele.addEventListener("click",handleOptionsClick);
    });
}

function startGame(){
    startScreen.classList.add("hide");
    quizScreen.classList.remove("hide");

    const category = document.getElementById("trivia_category").value;
    const difficulty = document.getElementById("trivia_difficulty").value;

    fetchQuiz(category,difficulty);
}

function fetchQuiz(category, difficulty){
    console.log(category,difficulty);
    fetch(`https://opentdb.com/api.php?amount=20${category=='any'?'':`&category=${category}`}&difficulty=${difficulty}&type=multiple`)
    .then(resp=>{return resp.json()}).then(data=>{
        questions = data.results;
        score = 0;
        currentQuestionNumber = 0;
        showQuestions();
    }).catch(error=>{
        console.error(error);
    });
}

function showQuestions(){
 
  console.log(questions);
  let incorectAnsIndex = 0;
  let correctAnsIndex = Math.floor(Math.random() * 3);

  if(currentQuestionNumber > 19){
    showEndScreen();
    return;
  }

  questionBox.innerText = decodeText(questions[currentQuestionNumber].question);

    document.querySelectorAll(".quizOption p").forEach((ele)=>{
      ele.parentElement.classList.remove("correct-answer","incorrect-answer");
      console.log(ele);
      if(correctAnsIndex != incorectAnsIndex){
      ele.innerText = decodeText(questions[currentQuestionNumber].incorrect_answers[incorectAnsIndex]);
      incorectAnsIndex++;
      }else{
        ele.innerText = decodeText(questions[currentQuestionNumber].correct_answer);
        correctAnsIndex = -1;
      }
    })

  if(timerId != null){
    alert("invalid stated of app");
  }else{
    timerId = setInterval(handleTimer,1000);
    currentTimeValue = 15;
    document.getElementById("timeValue").innerText = currentTimeValue;
  }
}


function handleOptionsClick(event){
  const option = event.target;
  console.log("clicked element is ",option);
  const optionValue = option.innerText;
  console.log(optionValue,"clicked option");
  if(timerId != null){
    clearInterval(timerId);
    timerId=null;

    console.log(optionValue,"option value");
    if(optionValue == decodeText(questions[currentQuestionNumber].correct_answer)){
      option.parentElement.classList.add("correct-answer");
      score++;
      scoreValue.innerText = score;
    }else{
      option.parentElement.classList.add("incorrect-answer");
      optionsArray.forEach((ele)=>{
        console.log("comparing ",ele.innerText,"and", questions[currentQuestionNumber].correct_answer," and got ",ele.innerText == decodeText(questions[currentQuestionNumber].correct_answer))
        if(ele.innerText == decodeText(questions[currentQuestionNumber].correct_answer)){
          console.log(ele);
          console.log("correct answer found");
          ele.parentElement.classList.add("correct-answer");
        }
      });
    }
    currentQuestionNumber++;
    setTimeout(showQuestions,3000);
  }
}

function decodeText(text) {
  let textarea = document.createElement("textarea");
  textarea.innerHTML = text;
  return textarea.value;
}

function handleTimer(){
  currentTimeValue--;
  document.getElementById("timeValue").innerText = currentTimeValue;
  if(currentTimeValue == 0){
    clearInterval(timerId);
    timerId = null;
   

    document.querySelectorAll(".quizOption p").forEach((ele)=>{
      console.log("comparing ",ele.innerText,"and", questions[currentQuestionNumber].correct_answer)
      if(ele.innerText == decodeText(questions[currentQuestionNumber].correct_answer)){
        console.log(ele);
        console.log("correct answer found");
        ele.parentElement.classList.add("correct-answer");
      }
    });
    currentQuestionNumber++;

    setTimeout(showQuestions,3000);
  }
  
}

function showEndScreen(){
  quizScreen.classList.add("hide");
  endScreen.classList.remove("hide");
  document.querySelector(".finalScore").innerText = score;
}

function reset(){
  quizScreen.classList.add("hide");
  endScreen.classList.add("hide");
  startScreen.classList.remove("hide");
  document.querySelector(".finalScore").innerText = '0';
}




document.addEventListener("DOMContentLoaded", init);

