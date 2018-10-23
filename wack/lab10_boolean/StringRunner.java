package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class StringRunner {

    public static void main(String args[]) {
        BiggestString run = new BiggestString();
        String[] tests = {"abc", "cba", "bca", "one", "fourteen", "twenty", "124323", "20009", "3434", "abcde", "ABCDE", "1234234324"};
        for (int i = 0; i < tests.length; i += 3) {
            run.setStrings(tests[i], tests[i + 1], tests[i + 2]);
            System.out.println(run);
            System.out.println("biggest = " + run.getBiggest() + "\n");
        }
    }
}
