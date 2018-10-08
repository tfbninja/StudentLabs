package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class MorseCode {

    private char letter;
    private String[] morseLib = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

    public MorseCode() {
        letter = ' ';
    }

    public MorseCode(char let) {
        letter = Character.toUpperCase(let);
    }

    public void setChar(char let) {
        letter = Character.toUpperCase(let);
    }

    public String getMorseCode() {
        if (Character.isAlphabetic(letter)) {
            return morseLib[(int) letter - 65];
        } else {
            return morseLib[(int) letter - 48 + 26];
        }
    }

    public String toString() {
        return getMorseCode() + "\n" + letter + " is " + getMorseCode() + " in morse!\n";
    }
}
