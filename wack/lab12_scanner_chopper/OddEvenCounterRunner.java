package lab12_scanner_chopper;

import java.util.Scanner;
// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class OddEvenCounterRunner {

    public static void main(String args[]) {
        String tests = "9 10 5 20\n11 22 33 44 55 66 77\n3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6\n2 4 6 8 2 4 6\n1 3 5 7 9 1 3 5";
        Scanner chopper = new Scanner(tests);
        chopper.useDelimiter("\n");
        OddEvenCounter tester = new OddEvenCounter();

        while (chopper.hasNextLine()){
            String test = chopper.nextLine();
            System.out.println(test);
            tester.setLine(test);
            System.out.println(tester + "\n");
        }
    }
}