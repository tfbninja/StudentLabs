package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class DivisorsRunner {

    public static void main(String args[]) {
        //add test cases 
        int[] tests = {10, 45, 14, 1024, 1245, 33, 65535};
        for (int i : tests) {
            System.out.println(i + " has divisors " + Divisors.getDivisors(i));
        }
    }
}
