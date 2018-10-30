package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

public class TriangleWordRunner {

    public static void main(String args[]) {
        String[] testWords = {"FUN", "COMPUTER", "A", "IT", "TOAD"};
        TriangleWord tester = new TriangleWord();

        for (String test : testWords) {
            tester.setWord(test);
            System.out.println(tester);
        }
    }
}
