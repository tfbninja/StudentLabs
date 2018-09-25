package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class StringChecker {

    private String word;

    public StringChecker() {
        word = "-1";
    }

    public StringChecker(String s) {
        word = s;
    }

    public void setString(String s) {
        word = s;
    }

    public boolean findLetter(char c) {
        if (word.indexOf(c) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean findSubString(String s) {
        if (word.contains(s) == true) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return word + "\n\n";
    }
}
