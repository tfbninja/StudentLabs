package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -
public class Prime {

    private int number;

    public Prime() {
        this.number = 0;
    }

    public Prime(int num) {
        this.number = num;
    }

    public void setPrime(int num) {
        this.number = num;
    }

    public boolean isPrime() {
        boolean prime = true;
        for (int i = 2; i < this.number; i++) {
            prime = prime && this.number % i != 0;
        }
        return prime;
    }

    public String toString() {
        String changer = "";
        if (!isPrime()) {
            changer = " NOT";
        }
        return "" + this.number + " IS" + changer + " PRIME.";
    }
}
