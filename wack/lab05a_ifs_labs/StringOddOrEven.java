package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven {

    private String word;
    private int wordLen;
    private String evenStr;

    public StringOddOrEven() {
        word = "";
        wordLen = -1;
    }

    public StringOddOrEven(String s) {
        word = s;
        wordLen = word.length();
    }

    public void setString(String s) {
        word = s;
        wordLen = word.length();
    }

    public boolean isEven() {
        if (wordLen % 2 == 0) {
            evenStr = "even";
            return true;
        } else {
            evenStr = "odd";
            return false;
        }
    }

    public String toString() {
        String output = word + " is " + evenStr;
        return output;
    }
}
