package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;

public class Average {

    private String line;
    private int sum = 0;
    private int[] nums;

    public Average() {
        this.line = "";
    }

    public Average(String s) {
        this.line = s;
    }

    public void setLine(String s) {
        this.line = s;
    }

    public int getCount() {
        this.nums = new int[this.line.length()];
        this.sum = 0;
        int count = 0;
        String[] numStrs = this.line.split(" ");
        int index = 0;
        for (String temp : numStrs) {
            if (!temp.equals("0")) {
                this.nums[index] = Integer.valueOf(temp);
                index++;
            }
        }

        for (int i : this.nums) {
            System.out.println("num: " + i);
            this.sum += i;
        }
        count = this.nums.length;
        System.out.println("sum: " + this.sum);
        System.out.println("count: " + count);
        return count;
    }

    public int getSum() {
        return this.sum;
    }

    public double getAverage() {
        double average = (double) getSum();
        average /= (double) getCount();
        return average;
    }

    public String getLine() {
        return this.line;
    }

    public String toString() {
        return "average = " + getAverage();
    }
}
