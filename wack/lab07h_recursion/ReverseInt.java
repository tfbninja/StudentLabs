/*
 * The goal of this lab is to use recursion to print an integer number backwards
 * Example:  
 *   Input:  752
 *   Output: 257
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class ReverseInt {

    public static void main(String[] args) {
        int number = 123456789;
        ReverseInt revIntObj = new ReverseInt();
        System.out.println(revIntObj.reverseDigits(number));
    }

    public int reverseDigits(int num) {
        if (num % 10 == num) {
            return num;
        } else if (num % 10 == 0){
            return num;
        }
        return reverseDigits((num - (num % 10))*10) + reverseDigits((num % 10)*10);
    }
    /*
    public String revDigs(String num) {
        int halfpoint;
        if (num.length() % 2 == 0){
            halfpoint = num.length() / 2; // 0 indexed
        } else {
            halfpoint = (num.length()-1) / 2; // 0 indexed
        }
        if (num.length() <= 1){
            return num;
        }
        return revDigs(num.substring(halfpoint)) + revDigs(num.substring(0, halfpoint));
    } */
}
