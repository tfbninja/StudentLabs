package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
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
        for (int i = 2; i < this.number; i++) {
            if (this.number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String output = this.number + " is ";
        if (!isPrime()) {
            output += "not ";
        }
        output += "prime.";
        return output;
    }
}
