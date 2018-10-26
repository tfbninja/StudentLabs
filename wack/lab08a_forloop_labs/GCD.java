package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class GCD {

    private int one, two;

    public GCD() {
        this.one = 0;
        this.two = 0;
    }

    public GCD(int numOne, int numTwo) {
        this.one = numOne;
        this.two = numTwo;
    }

    public void setNums(int numOne, int numTwo) {
        this.one = numOne;
        this.two = numTwo;
    }

    public long getGCD() {
        long gcd = 0;
        int largest = 0;
        if (this.one > this.two) {
            largest = this.one;
        } else {
            largest = this.two;
        }
        for (int i = 1; i <= largest; i++) {
            if (this.one % i == 0 && this.two % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public String toString() {
        return "the gcd of " + this.one + " and " + this.two + " is " + getGCD();
    }
}
