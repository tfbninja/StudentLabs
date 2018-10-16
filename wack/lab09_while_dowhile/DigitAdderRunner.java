package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class DigitAdderRunner {

    public static void main(String args[]) {
        //add test cases
        int[] tests = {234, 10000, 111, 9005, 84645, 8547, 123456789};
        for (int i : tests) {
            System.out.println(DigitAdder.sumDigits(i) + " is the sum of the digits of " + i);
        }
    }
}
