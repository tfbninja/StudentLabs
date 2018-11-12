package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrimesRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("primes.dat"));
        Prime tester = new Prime();
        int numtests = Integer.valueOf(file.nextLine()); // take out number of test cases

        while (file.hasNextInt()) {
            tester.setPrime(file.nextInt());
            System.out.println(tester);
        }
    }
}
