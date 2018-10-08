package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class StringEquality {

    private String wordOne, wordTwo;

    public StringEquality() {
        wordOne = "";
        wordTwo = "";
    }

    public StringEquality(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public void setWords(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public boolean checkEquality() {
        return wordOne == wordTwo;
    }

    public String toString() {
        if (checkEquality()) {
            return wordOne + " has the same letters as " + wordTwo + "\n";
        } else {
            return wordOne + " does not have the same letters as " + wordTwo + "\n";
        }
    }
}
