package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class WordFun {

    private String word;

    public WordFun() {
        word = "";
    }

    public WordFun(String w) {
        word = w;
    }

    public void setWord(String w) {
        word = w;
    }

    public void makeUpper() {
        word = word.toUpperCase();
    }

    public void addHyphen() {
        word = word.replaceAll(" ", "-");
    }

    public String toString() {
        return word;
    }
}