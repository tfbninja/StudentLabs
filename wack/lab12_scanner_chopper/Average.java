package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;

public class Average {

    private String line;
    private int sum = 0;
    private ArrayList<Integer> nums;

    public Average() {
        this.line = "";
        this.nums = new ArrayList<>();
    }

    public Average(String s) {
        this.line = s;
        this.nums = new ArrayList<>();
    }

    public void setLine(String s) {
        this.line = s;
        this.nums = new ArrayList<>();
    }

    public int getCount() { // and set sum
        Scanner chopper = new Scanner(this.line); // method used in class on the powerpoint
        int count = 0; // incrementer
        int tempSum = 0;
        while (chopper.hasNextInt()) {
            count++;
            nums.add(tempSum += chopper.nextInt());
        }
        this.sum = tempSum;
        return count;
    }

    public int getSum() { // and set sum
        Scanner chopper = new Scanner(this.line); // method used in class on the powerpoint
        int tempSum = 0;
        while (chopper.hasNextInt()) {
            tempSum += chopper.nextInt();
        }
        return this.sum = tempSum;
    }

    public double getAverage() {
        double average = (double) getSum();
        average /= (double) getCount();
        return average;
    }

    public String getLine() {
        return this.line;
    }

    @Override
    public String toString() {
        return String.valueOf(getAverage());
    }
}
