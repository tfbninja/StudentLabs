package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class TenToAny {

    private int base10;
    private int newBase;

    public TenToAny() {
        base10 = 0;
        newBase = 0;
    }

    public TenToAny(int num, int base) {
        this.base10 = num;
        this.newBase = base;
    }

    public void setNum(int num) {
        this.base10 = num;
    }

    public void setBase(int base) {
        this.newBase = base;
    }

    public void set(int num, int base) {
        this.base10 = num;
        this.newBase = base;
    }

    public String getNewNum() {
        String newNum = "";
        return newNum;
    }
    //add a toString method	
}
