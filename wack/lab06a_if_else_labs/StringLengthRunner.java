package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class StringLengthRunner {

    public static void main(String args[]) {
        //add test cases
        /*"hello goodbye\n" +
"one two\n" +
"three four\n" +
"TCEA UIL\n" +
"State Champions\n" +
"ABC DEF\n" +
"four five\n" +
"whoot what"*/
        StringLengthCheck test = new StringLengthCheck("hello", "goodbye");
        System.out.println(test);

        test.setWords("one", "two");
        System.out.println(test);

        test.setWords("three", "four");
        System.out.println(test);

        test.setWords("TCEA", "UIL");
        System.out.println(test);

        test.setWords("State", "Champions");
        System.out.println(test);

        test.setWords("ABC", "DEF");
        System.out.println(test);

        test.setWords("four", "five");
        System.out.println(test);

        test.setWords("whoot", "what");
        System.out.println(test);
    }
}