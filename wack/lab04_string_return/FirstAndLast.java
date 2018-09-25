package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class FirstAndLast {

    private String word;
    private String firstLetter;
    private String lastLetter;

    public FirstAndLast() {
        word = "";
        firstLetter = "-1";
        lastLetter = "-1";
    }

    public FirstAndLast(String s) {
        word = s;
    }

    public void setString(String s) {
        word = s;
    }

    public void findFirstLastLetters() {
        firstLetter = word.substring(0,1);
        lastLetter = word.substring(word.length() - 1);
    }

    public String toString(int whichOne) {
        if (whichOne == 0) {
            String output = firstLetter + " " + lastLetter;
            return output;
        }
        if (whichOne == 1) {
            return firstLetter;
        }
        if (whichOne == 2) {
            return lastLetter;
        }
        else {
            return firstLetter + " " + lastLetter;
        }

    }
}
