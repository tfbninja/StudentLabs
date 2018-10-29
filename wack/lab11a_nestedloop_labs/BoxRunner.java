package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

public class BoxRunner {

    public static void main(String args[]) {
        Box tester = new Box();
        int[] tests = {3, 4, 5, 2, 1};
        for (int i : tests) {
            tester.setSize(i);
            System.out.println(tester);
        }
    }
}
