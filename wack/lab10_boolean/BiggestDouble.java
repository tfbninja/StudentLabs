package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
import static java.lang.System.*;

public class BiggestDouble {

    private double one, two, three, four;

    public BiggestDouble() {
        this(0, 0, 0, 0);
    }

    public BiggestDouble(double a, double b, double c, double d) {
        setDoubles(a, b, c, d);
    }

    public void setDoubles(double a, double b, double c, double d) {
        this.one = a;
        this.two = b;
        this.three = c;
        this.four = d;
    }

    public double getBiggest() {
        if (this.one > this.two && this.one > this.three && this.one > this.four) {
            return this.one;
        } else if (this.two > this.one && this.two > this.three && this.two > this.four) {
            return this.two;
        } else if (this.three > this.one && this.three > this.two && this.three > this.four) {
            return this.three;
        }
        return this.four;

    }

    public String toString() {
        return this.one + ", " + this.two + ", " + this.three + ", " + this.four;
    }
}
