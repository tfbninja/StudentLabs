package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
import static java.lang.System.*;

public class BiggestString {

    private String one, two, three;

    public BiggestString() {
        this("", "", "");
    }

    public BiggestString(String a, String b, String c) {
        setStrings(a, b, c);
    }

    public void setStrings(String a, String b, String c) {
        this.one = a;
        this.two = b;
        this.three = c;
    }

    public String getBiggest() {
        if (this.one.compareTo(this.two) > 0 && this.one.compareTo(this.three) > 0) {
            return this.one;
        } else if (this.two.compareTo(this.one) > 0 && this.two.compareTo(this.three) > 0) {
            return this.two;
        }
        return this.three;
    }

    public String toString() {
        return "\"" + this.one + "\", \"" + this.two + "\", \"" + this.three + "\"";
    }
}
