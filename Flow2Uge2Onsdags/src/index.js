import 'bootstrap/dist/css/bootstrap.css';
import jokes from "./jokes";

fetch('https://studypoints.info/jokes/api/jokes/period/hour/')
 .then(function(response) {
   return response.json();
 })
 .then(function(jokes) {
   console.log(jokes.id);
   console.log(jokes.joke);
   console.log(jokes.reference);
});

document.getElementById("getJoke").onclick = function(){
    var jokeid = document.getElementById("getJokeInput").value-1;
    var joke = jokes.getJokeById(jokeid);
    document.getElementById("jokes").innerHTML = joke;
}


document.getElementById("addJoke").onclick = function(){
    const addsJoke = document.getElementById("addJokeInput").value;
    jokes.addJoke(addsJoke);
    document.getElementById("jokes2").innerHTML = jokes.getJokes().map(joke => "<li>"+joke+"</li>").join("\n");
}


document.getElementById("north").onclick = function() {
    alert("North");
}


document.getElementById("south").onclick = function() {
    alert("South");
}


document.getElementById("west").onclick = function() {
    alert("West");
}


document.getElementById("east").onclick = function() {
    alert("East");
}
