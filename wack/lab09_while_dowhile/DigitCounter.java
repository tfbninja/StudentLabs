package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class DigitCounter {

    private static int dig;
    private static int num;

    public static int countDigits(int number) {
        num = number;
        int counter = 0;
        /* get length */
        while (number > 0) {
            counter++;
            number /= 10;
        }
        dig = counter;
        return counter;
    }
}
