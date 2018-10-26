package lab19c_interfaces_RomanNumeral_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class RomanNumeral implements Comparable<RomanNumeral> {

    private Integer number;
    private String roman;
    private final static int[] NUMBERS = {1000, 900, 500, 400, 100, 90,
        50, 40, 10, 9, 5, 4, 1};
    private final static String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I"};

    public RomanNumeral(String str) {
        this.roman = str;
    }

    public RomanNumeral(Integer orig) {
        this.number = orig;
    }

    public void setNumber(Integer orig) {
        this.number = orig;
    }

    public void setRoman(String str) {
        this.roman = str;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getRoman() {
        return this.roman;
    }

    public Integer toInt() {
        Integer temp = 0;
        String tempstr = this.roman;
        int index = 0;
        while (tempstr.length() > 0) {
            for (String letter : LETTERS) {
                if (tempstr.substring(0, 2).equals(letter)) {
                    temp += NUMBERS[index];
                    tempstr = tempstr.substring(2);
                } else if (tempstr.substring(0, 1).equals(letter)) {
                    temp += NUMBERS[index];
                    tempstr = tempstr.substring(1);
                }
            }
        }
        this.number = temp;
        return this.number;
    }

    public int compareTo(RomanNumeral r) {
        return 0;
    }

    //write  toString() method
    @Override
    public String toString() {
        return "Roman: " + this.roman + ", Number: " + this.number;
    }
}
