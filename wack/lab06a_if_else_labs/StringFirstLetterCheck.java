package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class StringFirstLetterCheck {

    char char1, char2;
    String wordOne, wordTwo;

    public StringFirstLetterCheck() {
        char1 = ' ';
        char2 = ' ';
        wordOne = "";
        wordTwo = "";
    }

    public StringFirstLetterCheck(String one, String two) {
        char1 = one.charAt(0);
        char2 = two.charAt(0);
        wordOne = one;
        wordTwo = two;
    }

    public void setWords(String one, String two) {
        char1 = one.charAt(0);
        char2 = two.charAt(0);
        wordOne = one;
        wordTwo = two;
    }

    public boolean checkFirstLetter() {
        return char1 == char2;
    }

    public String toString() {
        if (checkFirstLetter()){
            return wordOne + " has the same first letter as " + wordTwo + "\n";
        }
        return wordOne + " does not have the same first letter as " + wordTwo + "\n";
    }
}