package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer {

    private char theChar;
    private int asciiValue;

    public CharacterAnalyzer() {
        theChar = ' ';
        asciiValue = -1;
    }

    public CharacterAnalyzer(char c) {
        theChar = c;
        asciiValue = (int) theChar;
    }

    public void setChar(char c) {
        theChar = c;
        asciiValue = (int) theChar;
    }

    public char getChar() {
        return theChar;
    }

    public boolean isUpper() {
        if (asciiValue >= 65 && asciiValue <= 90) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLower() {
        if (asciiValue >= 97 && asciiValue <= 122) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNumber() {
        if (asciiValue >= 48 && asciiValue <= 57) {
            return true;
        } else {
            return false;
        }
    }

    public int getASCII() {
        return asciiValue;
    }

    public String toString() {
        if (isNumber() == true) {
            return theChar + " is a number. ASCII == " + asciiValue + "\n";
        } else if (isLower() == true) {
            return theChar + " is a lowercase character. ASCII == " + asciiValue + "\n";
        } else if (isUpper() == true) {
            return theChar + " is an uppercase character. ASCII == " + asciiValue + "\n";
        } else {
            return theChar + " is neither a number nor a letter. ASCII == " + asciiValue + "\n";
        }

    }
}
