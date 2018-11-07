package lab12_scanner_chopper;

import java.util.Scanner;
// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class LineTotaller {

    private String line;

    public LineTotaller() {
        this.line = "";
    }

    public LineTotaller(String s) {
        this.line = s;
    }

    public void setLine(String s) {
        this.line = s;
    }

    public int getSum() {
        int total = 0;
        Scanner chopper = new Scanner(this.line);
        while (chopper.hasNextInt()) {
            total += chopper.nextInt();
        }
        return total;
    }

    public String getLine() {
        return this.line;
    }

    public String toString() {
        return "sum = " + this.getSum();
    }
}
