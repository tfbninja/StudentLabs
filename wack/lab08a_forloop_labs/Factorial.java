package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class Factorial {

    private int number;

    public Factorial() {
        this.number = 0;
    }

    public Factorial(int num) {
        this.number = num;
    }

    public void setNum(int num) {
        this.number = num;
    }

    public int getNum() {
        return this.number;
    }

    public long getFactorial() {
        long factorial = 1;
        for (int i = 1; i <= this.number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public String toString() {
        return "factorial of " + getNum() + " is " + getFactorial() + "\n";
    }
}
