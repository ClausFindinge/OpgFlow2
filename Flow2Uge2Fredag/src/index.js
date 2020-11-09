import 'bootstrap/dist/css/bootstrap.css';

const eventClick = document.getElementById('svg2');
const returPoint1 = document.getElementById('contryName');
const returPoint2 = document.getElementById('contryPopulation');
const returPoint3 = document.getElementById('contryArea');
const returPoint4 = document.getElementById('contryBorders');
const returPoint5 = document.getElementById('title4');


function getCountry(id){


var url = "http://restcountries.eu/rest/v1/alpha?codes=" + id;
console.log(url)
fetch(url)
.then(res => res.json())
.then(data => {

    console.log(data)

    eventClick.innerHTML = 
    returPoint1.innerText = "Name: " + data[0].name; '<br></br>'
    returPoint2.innerText = "Population: " + data[0].population;
    returPoint3.innerText = "Area: " + data[0].area;
    returPoint4.innerText = "Borders: " + data[0].borders;
    returPoint5.innerText = data[0].name;
})};
 

eventClick.addEventListener("click", eventHandler, false)

var prev;

function eventHandler(e) {
    var id = e.target.id;
    if (!prev) {
e.target.style.fill = "red";
prev = e.target;
    } else {
prev.style.fill = "rgb(192, 192, 192)";
e.target.style.fill = " red";
prev = e.target;
    }
    getCountry(id);
}


 