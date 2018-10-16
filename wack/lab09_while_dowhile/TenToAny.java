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
    private int newNum;

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

    public int getNewNum() {
        int newNum = 0;
        while (this.base10 > 0) {
            newNum += this.base10 % 10 / this.newBase;
            newNum /= 10;
            this.base10 /= 10;
        }
        this.newNum = newNum;
        return newNum;

    }
    //add a toString method	

    @Override
    public String toString() {
        getNewNum();
        return this.base10 + " base 10 is " + this.newNum + " in base " + this.newBase;
    }
}
