package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;

public class Average {

    private String line;

    public Average() {
        this.line = "";
    }

    public Average(String line) {
        this.line = line;
    }

    public String setLine(String line) {
        return this.line = line;
    }

    private int getLowest() {
        int lowest = Integer.MIN_VALUE;
        Scanner chop = new Scanner(this.line);
        while (chop.hasNextInt()) {
            int token = chop.nextInt();
            if (token > lowest) {
                lowest = token;
            }
        }
        return lowest;
    }

    public double getAverage() {
        double average = 0.0;

        return average;
    }
    //write a getLine method
    //write a toString method
}
