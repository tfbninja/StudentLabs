package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;

public class AddStrings {

    private String first, last;
    private String sum;

    public AddStrings() {
        first = "";
        last = "";
    }

    public AddStrings(String one, String two) {
        first = one;
        last = two;
    }

    public void setStrings(String one, String two) {
        first = one;
        last = two;
    }

    public void add() {
        sum = first + " " + last;
    }

    public String toString() {
        //return first + " " + last;
        return sum;
    }

    public void formatOutput() {
        System.out.println("first :: " + first);
        System.out.println("last :: " + last);
        System.out.println("sum :: " + sum);
    }

}
