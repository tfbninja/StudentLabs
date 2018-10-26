package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class LoopStats {

    private int start, stop;

    public LoopStats() {
        this.start = 0;
        this.stop = 0;
    }

    public LoopStats(int beg, int end) {
        this.start = beg;
        this.stop = end;
    }

    public void setNums(int beg, int end) {
        this.start = beg;
        this.stop = end;
    }

    public int getEvenCount() {
        int evenCount = 0;
        for (int i = this.start; i <= this.stop; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public int getOddCount() {
        int oddCount = 0;
        for (int i = this.start; i <= this.stop; i++) {
            if (i % 2 == 1) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public int getTotal() {
        int total = 0;
        for (int i = this.start; i <= this.stop; i++) {
            total += i;
        }
        return total;
    }

    public String toString() {
        return this.start + " " + this.stop + "\ntotal " + getTotal() + "\neven count " + getEvenCount() + "\nodd count " + getOddCount();
    }
}
