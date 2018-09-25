package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
import static java.lang.System.*;

public class NumberVerify {

    public boolean isOdd(int num) {
        num = Math.abs(num);
        if (num % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
