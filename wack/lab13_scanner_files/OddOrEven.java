package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

public class OddOrEven {

    private int number;

    public OddOrEven() {
        this.number = 0;
    }

    public OddOrEven(int num) {
        this.number = num;
    }

    public void setNum(int num) {
        this.number = num;
    }

    public boolean isOdd() {
        if (this.number % 2 == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String mod2 = "";
        if (isOdd()) {
            mod2 = "odd";
        } else {
            mod2 = "even";
        }
        return number + " is " + mod2 + "\n";
    }
}
