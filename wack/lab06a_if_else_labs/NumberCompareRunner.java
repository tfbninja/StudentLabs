package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class NumberCompareRunner {

    public static void main(String args[]) {
        NumberCompare test = new NumberCompare(5, 6);
        out.println(test);

        test.setNums(45, 66);
        System.out.println(test);

        test.setNums(-25, 10324);
        System.out.println(test);

        test.setNums(324, 12312);
        System.out.println(test);

        test.setNums(34, 33);
        System.out.println(test);


    }
}