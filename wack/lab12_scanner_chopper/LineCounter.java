package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;

public class LineCounter {

    private String line;

    public LineCounter() {
        setLine("");
    }

    public LineCounter(String s) {
        setLine(s);
    }

    public void setLine(String s) {
        this.line = s;
    }

    public int getCount() {
        Scanner chopper = new Scanner(this.line);
        int count = 0;
        while (chopper.hasNextInt()) {
            count++;
            chopper.nextInt();
        }
        return count;
    }

    public String getLine() {
        return this.line;
    }

    public String toString() {
        return "count = " + this.getCount();
    }
}
