package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
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
        int num = 1;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        for (int i = 1; i < max; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                num = i;
            }
        }
        return num;
    }

    public String toString() {
        String output = "";
        int[] repeats = new int[this.number * 3];
        int repeatIndex = 0;
        for (int a = 1; a <= this.number; a++) {
            for (int b = 1; b <= this.number; b++) {
                for (int c = 1; c <= this.number; c++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        if (a % 2 == 0 && b % 2 == 1 || a % 2 == 1 && b % 2 == 0) {
                            if (c % 2 == 1) {
                                if (GCF(a, b, c) <= 1) {
                                    if (a != b && a != c && b != c) {
                                        int numRepeats = 0;
                                        for (int i = 0; i < repeatIndex; i++) {
                                            if (repeats[i] == a || repeats[i] == b || repeats[i] == c) {
                                                numRepeats++;
                                            }
                                        }
                                        if (numRepeats <= 2) {
                                            output += a + " " + b + " " + c + "\n";
                                            repeats[repeatIndex] = a;
                                            repeatIndex++;
                                            repeats[repeatIndex] = b;
                                            repeatIndex++;
                                            repeats[repeatIndex] = c;
                                            repeatIndex++;
                                        }
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
