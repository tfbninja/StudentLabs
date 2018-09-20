package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Sum {
    //instance variables

    private double one, two, sum;

    public void setNums(double num1, double num2) {
        one = num1;
        two = num2;
    }

    public void sum() {
        sum = one + two;
    }

    public void print() {
        System.out.println(one + " + " + two + " = " + sum);
    }
}
