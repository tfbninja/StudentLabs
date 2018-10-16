package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class DigitMath {

    public static double averageDigits(int number) {
        double sum = 0;
        int counter = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
            counter++;
        }
        return sum / counter;
    }
}
