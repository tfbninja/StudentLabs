package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner {

    public static void main(String args[]) {
        String[] tests = {"9 10 5 20", "11 22 33 44 55 66 77", "48 52 29 100 50 29", "0", "100 90 95 98 100 97"};
        Average tester = new Average();

        for (String test : tests) {
            tester.setLine(test);
            System.out.println(tester);
        }
    }
}
