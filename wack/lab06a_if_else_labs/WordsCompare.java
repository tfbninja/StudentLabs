package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class WordsCompare {

    private String wordOne, wordTwo;
    private int compare;

    public WordsCompare() {
        wordOne = "";
        wordTwo = "";
    }

    public WordsCompare(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public void setWords(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public void compare() {
        compare = wordOne.compareTo(wordTwo);
    }

    @Override
    public String toString() {
        compare();
        if (compare < 0) {
            return wordOne + " should be placed before " + wordTwo + "\n";
        } else if (compare > 0) {
            return wordOne + " should be placed after " + wordTwo + "\n";
        } else {
            return wordOne + " is " + wordTwo;
        }
    }
}