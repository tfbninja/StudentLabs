package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class TheLine {

    private String line;

    public TheLine() {
        this.line = "";
    }

    public TheLine(String s) {
        this.line = s;
    }

    public void setLine(String s) {
        this.line = s;
    }

    public String getLine() {
        return this.line;
    }

    public int getLargest() {
        Scanner chop = new Scanner(this.line);
        int largest = chop.nextInt();
        while (chop.hasNextInt()) {
            int temp = chop.nextInt();
            if (temp > largest) {
                largest = temp;
            }
        }
        return largest;
    }

    public String toString() {
        return "Largest == " + getLargest();
    }
}
