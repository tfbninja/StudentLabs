package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class StringEqualityRunner {

    public static void main(String args[]) {
        StringEquality test = new StringEquality("hello", "goodbye");
        System.out.println(test);

        test.setWords("one", "two");
        System.out.println(test);

        test.setWords("three", "four");
        System.out.println(test);

        test.setWords("TCEA", "UIL");
        System.out.println(test);

        test.setWords("State", "Champions");
        System.out.println(test);

        test.setWords("ABC", "ABC");
        System.out.println(test);

        test.setWords("ABC", "CBA");
        System.out.println(test);

        test.setWords("Same", "Same");
        System.out.println(test);
    }
}