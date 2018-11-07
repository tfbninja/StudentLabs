package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;

public class LineBreakerRunner {

    public static void main(String args[]) {
        // ew i don't wanna take 45s to format the test cases from the doc...lemme take 5min to automate it.
        String tests = "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9\n4\nt h e b i g b a d w o l f h a d b i g e a r s a n d t e e t h\n2\na c o m p u t e r s c i e n c e p r o g r a m\n7\ni a m s a m i a m\n2";
        LineBreaker tester = new LineBreaker();
        Scanner chopper = new Scanner(tests);
        chopper.useDelimiter("\n");

        while (chopper.hasNextLine()) {
            String test = chopper.nextLine(); // nums/letters to split and stuff
            System.out.println(test);

            tester.setLineBreaker(test, chopper.nextInt()); // next int the number to split on
            if (chopper.hasNextLine()) { // prevent the off by one error at the end of the program that triggers an error
                chopper.nextLine();
            }
            System.out.println(tester + "\n"); // toString() + "\n"
        }
    }
}
