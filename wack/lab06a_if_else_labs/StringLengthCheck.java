package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class StringLengthCheck {

    String wordOne, wordTwo;

    public StringLengthCheck() {
        wordOne = "";
        wordTwo = "";
    }

    public StringLengthCheck(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public void setWords(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public boolean checkLength() {
        return wordOne.length() == wordTwo.length();
    }

    public String toString() {
        if (checkLength()){
            return wordOne + " has the same # of letters as " + wordTwo + "\n";
        }
        return wordOne + " does not have the same # of letters as " + wordTwo + "\n";
    }
}