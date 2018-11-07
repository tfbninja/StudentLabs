package lab12_scanner_chopper;

import java.util.Scanner;
// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class OddEvenCounter {

    private String line;

    public OddEvenCounter() {
        this.line = "";
    }

    public OddEvenCounter(String s) {
        this.line = s;
    }

    public void setLine(String s) {
        this.line = s;
    }

    public int getEvenCount() {
        int count = 0;
        Scanner chopper = new Scanner(this.line);
        while (chopper.hasNextInt()){
            if (chopper.nextInt() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public int getOddCount() {
        int count = 0;
        Scanner chopper = new Scanner(this.line);
        while (chopper.hasNextInt()){
            if (chopper.nextInt() % 2 == 1){
                count++;
            }
        }
        return count;
    }

    public String toString() {
        return "even count = " + this.getEvenCount() + "\nodd count = " + this.getOddCount();
    }
}
