package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class Divisors {

    public static String getDivisors(int number) {
        String divisors = "";
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                divisors += i + " ";
            }
            i++;
        }
        return divisors;
    }
}
