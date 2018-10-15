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
        int number = 123;
        System.out.println(reverseDigits(number));
    }

    public static int reverseDigits(int num) {
        return Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString()); // :)
    }
}
