package lab07a_if_else_if_labs;

public class Decoder {

    private char letter;

    public Decoder() {
        letter = ' ';
    }

    public Decoder(char let) {
        letter = let;
    }

    public void setLetter(char let) {
        letter = let;
    }

    public char getLetter(){
        return letter;
    }
    public char deCode() {
        char result = letter;
        if (Character.isDigit(letter)){
            result += 65-48;
        } else if (Character.isAlphabetic(letter)){
            if (Character.isLowerCase(letter)){
                result = Character.toUpperCase(result);
            } else {
                result = Character.toLowerCase(result);
            }
        } else {
            result = '#';
        }
        return result;
    }

    public String toString() {
        return letter + " decodes to " + deCode() + "\n";
    }
}
