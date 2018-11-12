package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;

public class Average {

    private String line;

    public Average() {
        this.line = "";
    }

    public Average(String line) {
        this.line = line;
    }

    public String setLine(String line) {
        this.line = line;
        return this.line;
    }

    public String getLine() {
        return this.line;
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
        int size = 0;
        Scanner chop = new Scanner(this.line);
        while (chop.hasNextInt()) { // get size
            size++;
            chop.nextInt();
        }

        int[] newList = new int[size - 1]; // smaller by 1 bc we are dropping the lowest
        Scanner choppa = new Scanner(this.line);

        int index = 0;
        boolean dropped = false;
        while (choppa.hasNextInt()) {
            int num = choppa.nextInt();
            if (num == getLowest() && !dropped) {
                newList[index] = num;
                dropped = true;
                index++;
            } else {
                newList[index] = num;
                index++;
            }

        }
        double average = 0.0;
        int total = 0;
        for (int i : newList) {
            total += i;
        }
        average = total / (double) size;
        return average;
    }

    @Override
    public String toString() {
        return "average = " + getAverage();
    }
    //write a toString method
}
