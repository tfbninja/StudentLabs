package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class SumRunner {

    public static void main(String[] args) {
        Sum test = new Sum();
        test.setNums(5, 5);
        test.sum();
        test.print();

        test.setNums(90, 100.0);
        test.sum();
        test.print();

        //add more test cases

    }
}