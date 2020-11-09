class Jokes {
    constructor(initialData){
        this._jokes = initialData;
    }

    addJoke(joke){
        this._jokes.push(joke);
    }

    getJokeById(i) {
        return this._jokes[i];
    }
    
    getJokes() {
        return this._jokes;
    }
}

const initialData = [
    "A day without sunshine is like, night.",
    "At what age is it appropriate to tell my dog that he's adopted?",
    "I intend to live forever, or die trying",
  ]

const jokes = new Jokes(initialData);
window.jokes = jokes;

export default jokes;



