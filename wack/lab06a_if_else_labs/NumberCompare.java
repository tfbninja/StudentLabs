package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class NumberCompare {

    private int one, two;

    public NumberCompare() {
        one = -1;
        two = -1;
    }

    public NumberCompare(int n1, int n2) {
        one = n1;
        two = n2;
    }

    public void setNums(int n1, int n2) {
        one = n1;
        two = n2;
    }

    public int getLargest() {
        if (one > two) {
            return one;
        } else if (one < two) {
            return two;
        } else {
            return -1;
        }
    }

    public int getSmallest() {
        if (one < two) {
            return one;
        } else if (one > two) {
            return two;
        } else {
            return -1;
        }
    }

    public String toString() {
        return one + " -- " + two + "\nlargest == " + getLargest() + "\nsmallest == " + getSmallest() + "\n\n";
    }
}
