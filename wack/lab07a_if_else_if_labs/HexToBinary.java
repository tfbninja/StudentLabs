package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class HexToBinary {

    private char hex;

    public HexToBinary() {
        hex = 'G';
    }

    public HexToBinary(char hexNum) {
        hex = hexNum;
    }

    public void setHex(char hexNum) {
        hex = hexNum;
    }

    public String getBinary() {
        try {
            return Integer.toBinaryString(Integer.parseInt(String.valueOf(hex).toUpperCase(), 16));
        } catch (NumberFormatException Error) {
            return "ERROR";
        }
    }

    public String toString() {
        return hex + " is " + getBinary() + " in binary!";
    }
}
