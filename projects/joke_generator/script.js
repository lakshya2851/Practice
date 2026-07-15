async function getJoke() {

    let response = await fetch("https://official-joke-api.appspot.com/random_joke");

    let data = await response.json();

    document.getElementById("setup").innerText = data.setup;

    document.getElementById("punchline").innerText = data.punchline;

}