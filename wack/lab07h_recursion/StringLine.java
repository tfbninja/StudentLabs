/*
 * The goal of this lab is to use recursion to print a sentence backwards
 * Example:
 *   Input:  It works!
 *   Output: !skrow tI
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class StringLine {

    public static void main(String[] args) {
        String str = "It works!";
        StringLine stringObj = new StringLine();
        stringObj.printString(str);

    }

    public void printString(String word) {
        System.out.println(new StringBuilder(word).reverse().toString());
    }
}
