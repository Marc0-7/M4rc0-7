//fnzione random
let rand = (min, max) => Math.floor(Math.random() * (max - min + 1)) + min;

//funzione stoppa tempo
//da usare dentro una funzione "async" con prima "await"
function sleep(ms)
{
    return new Promise(resolve => setTimeout(resolve, ms));
}

//funzione rimuovi elementi tramite ID
document.getElementById("bottoni").remove();

//creazione e aggiunta di nuovi elementi tramite ID
let nuovoElemento = document.createElement("h2");
h2.textContent = "namocuu";
document.getElementById("tavolo").appendChild(h2);
