package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class ReverseNumber {

    private int number;

    public ReverseNumber() {
        number = 0;
    }

    public ReverseNumber(int num) {
        this.number = num;
    }

    public void setNum(int num) {
        this.number = num;
    }

    public int getReverse() {
        int rev = 0;
        while (this.number > 0) {
            rev *= 10;
            rev += number % 10;
            number /= 10;
        }
        return rev;
    }
    //add  a toString	
}
