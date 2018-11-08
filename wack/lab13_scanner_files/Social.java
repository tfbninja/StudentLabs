package lab13_scanner_files;

import java.util.Scanner;

public class Social {

    private String socialNum;

    public Social() {
        this.socialNum = "";
    }

    public Social(String soc) {
        setSocial(soc);
    }

    public void setSocial(String soc) {
        this.socialNum = soc;
    }

    public String getLine() {
        return this.socialNum;
    }

    public int getSum() {
        Scanner chop = new Scanner(this.socialNum);
        chop.useDelimiter("-");
        int total = 0;
        while (chop.hasNextInt()) {
            total += chop.nextInt();
        }
        return total;
    }

    public String toString() {
        return "SS# " + this.socialNum + " has a sum of " + this.getSum();
    }
}
