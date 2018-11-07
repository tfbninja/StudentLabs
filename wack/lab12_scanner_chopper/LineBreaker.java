package lab12_scanner_chopper;

import java.util.Scanner;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class LineBreaker {

    private String line;
    private int breaker;

    public LineBreaker() {
        this("", 0);
    }

    public LineBreaker(String s, int b) {
        this.setLineBreaker(s, b);
    }

    public void setLineBreaker(String s, int b) {
        this.line = s;
        this.breaker = b;
    }

    public String getLine() {
        return this.line;
    }

    public String getLineBreaker() {
        String box = "";
        Scanner chopper = new Scanner(this.line);
        while (chopper.hasNext()) {
            String temp = "";
            for (int i = 0; i < this.breaker; i++) {
                if (chopper.hasNext()) {
                    temp += chopper.next();
                }
            }
            box += temp + "\n";
        }

        return box;
    }

    public String toString() {
        return this.getLineBreaker();
    }
}
