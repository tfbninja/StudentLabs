package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class PerfectRunner {

    public static void main(String args[]) {
        //add test cases
        int[] tests = {496, 45, 6, 14, 8128, 1245, 33, 28, 27, 33550336};
        Perfect tester = new Perfect();
        for (int i : tests) {
            tester.setNum(i);
            String notornot = "";
            if (!tester.isPerfect()) {
                notornot = "not ";
            }
            System.out.println(i + " is " + notornot + "perfect");
        }
    }
}
