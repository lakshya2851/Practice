async function getAdvice() {
     let response = await fetch("https://api.adviceslip.com/advice");
     let data = await response.json();

    document.getElementById("advice").innerText = data.slip.advice;

}