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
        int number = 457;
        reverseDigits(number);
    }

    public static int reverseDigits(int num) {
        if (num < 10){
            System.out.print(num);
            return num;
        }
        System.out.print(num % 10);
        return reverseDigits(num / 10);
    }
}
