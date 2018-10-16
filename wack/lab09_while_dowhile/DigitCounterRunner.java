package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class DigitCounterRunner {

    public static void main(String args[]) {
        //add test cases 
        //DigitCounter dCount = new DigitCounter();
        print(234, DigitCounter.countDigits(234));
        print(10000, DigitCounter.countDigits(10000));
        print(111, DigitCounter.countDigits(111));
        print(9005, DigitCounter.countDigits(9005));
        print(84645, DigitCounter.countDigits(84645));
        print(8547, DigitCounter.countDigits(8547));
        print(123456789, DigitCounter.countDigits(123456789));
    }

    public static void print(int num, int dig) {
        System.out.println(num + " contains " + dig + " digits");
    }
}
