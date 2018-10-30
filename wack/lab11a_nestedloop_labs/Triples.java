package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

public class Triples {

    private int number;

    public Triples() {
        this.number = 0;
    }

    public Triples(int num) {
        this.number = num;
    }

    public void setNum(int num) {
        this.number = num;
    }

    private int GCF(int a, int b, int c) {
        int max = 0;
        return 1;
    }

    public String toString() {
        String output = "";
        for (int a = 1; a <= this.number; a++) {
            for (int b = 1; b <= this.number; b++) {
                for (int c = 1; c <= this.number; c++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        if (a % 2 == 0 && b % 2 == 1 || a % 2 == 1 && b % 2 == 0) {
                            if (c % 2 == 1) {
                                if (GCF(a, b, c) <= 1) {
                                    if (a != b && a != c && b != c) {
                                        output += a + " " + b + " " + c + "\n";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return output + "\n";
    }
}
