//Opgave 1

let names = ["Lars", "Jan" , "Bo", "Peter", "Frederik"];

function chackA(name){
    return name.Include("a");
}

function myFilter(array, callback){
    for (let index = 0; index < array.length; index++) {
        if (array[index].callback == true) {
            names2.push(array[index]);
        }}
        return names2;
        }
    let namesWithA = names.filter(checkA);
    let namesReserved = s => s.split("").reverse().join("");
    let myFilterNames = myFilter(names, checkA);
    console.log(namesWithA);
    console.log(namesReserved);
    console.log(myFilterNames);

// Opgave 2

function myFilter(array, callback) {
    var newArray = [];
    for (var i = 0; i < array.length; i++) {
        let word = array[i];
        if(callback(word)) {
                newArray.push(word);
        }
    }
    return newArray;
}

var names = ["Michael", "Andreas", "Simon", "David", "Claus"];

console.log("Original Names: " + names.join(', '));

var filterNames = myFilter(names, function (word)  {
    return word.toLowerCase().inCludes("a");
    
    });

console.log("Filtrerede navne: " + filterNames.join(', '));
console.log();

function myMap(array, callback) {
    var newArray = [];
    for (var i = 0; i < array.length; i++) {
        let word = array[i];
        newArray.push(callnack(word));
    }
return newArray;
}

console.log("Originale navne:" + names.join(', ') );
var reverseWords = myMap(names, function (word) {
    return word.split("").reverse().join("");
});

console.log("Bagvendte navne: " + reverseWords.join(', '));
console.log();


//Opgave 3
//a
let numbers = [1, 4, 5, 10, 11];

const cramAlg = (n, i) => {
    return numbers[i + 1] ? (n + numbers[i + 1]) : n;
};

const x = [...numbers.map(cramAlg)];
console.log(x);


//b
const persons = names.map(p => '<a href=\"\">' + p + '</a>');
let html = '<nav> \n \t' + persons.join("\n \t") + '\n</nav>';
console.log(html);


//c
var personsPhones = [{name: "Hassan", phone: "1234567" }, {name: "Hassan", phone: "1234567" }, {name: "Hassan", phone: "1234567" }, {name: "Hassan", phone: "1234567" }];
let p = personsPhones.map(personsPhones => ({
    name: personsPhones.name,
    phone: personsPhones.phone
}));

let rowsAndTables = p.join("");

console.log(rowsAndTables);

