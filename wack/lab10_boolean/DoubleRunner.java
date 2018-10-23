package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
import static java.lang.System.*;

public class DoubleRunner {

    public static void main(String[] args) {
        double[] tests = {4.5, 6.7, 7.8, 9.0, 14.51, 6.17, 71.8, 1.0, 41.15, 816.7, 17.8, 19.0, 884.5, 16.7, 7.8, 9.0, 4.5, -456.7, 677.8, 9.0, 4.5, 16.7, -7.8, -9.0};
        BiggestDouble run = new BiggestDouble();
        for (int i = 0; i < tests.length; i += 4) {
            run.setDoubles(tests[i], tests[i + 1], tests[i + 2], tests[i + 3]);
            System.out.println(run);
            System.out.println("biggest = " + run.getBiggest() + "\n");
        }
    }
}
