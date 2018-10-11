/*
 * The goal of this program is to print out the sum of all of the integers
 * from zero up to the number entered in.
 * Example - If 3 were entered in, you would output "The sum of all numbers through 3 == 6" (0 + 1 + 2 + 3)
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class Numbers {

    public static void main(String[] args) {
        int num = 6;

        Numbers numObj = new Numbers();
        System.out.println("The sum of all numbers through " + num + "  == " + numObj.printNum(num));
    }
    //Write the recursive method to sum of all of the integers from zero up to the number entered

    public int printNum(int num) {
        if (num <= 1) {
            return num;
        }
        return printNum(num - 1) + num;
    }
}
