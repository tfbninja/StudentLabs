package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner {

    public static void main(String[] args) {
        //add in input
        NumberVerify test = new NumberVerify();
        int[] testCases = {111, 2000, -99, 1111, -850};

        for (int i = 0; i <= testCases.length - 1; i++) {
            System.out.println("Number :: " + testCases[i]);
            System.out.println(testCases[i] + " is odd :: " + test.isOdd(testCases[i]));
            System.out.println(testCases[i] + " is even :: " + test.isEven(testCases[i]));
        }

        System.out.print("Enter an integer :: ");
        Scanner keyboard = new Scanner(System.in);
        int amt = keyboard.nextInt();
        System.out.println(amt + " is odd :: " + test.isOdd(amt));
        System.out.println(amt + " is even :: " + test.isEven(amt));
    }
}
