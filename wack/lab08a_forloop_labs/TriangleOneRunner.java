package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleOneRunner {

    public static void main(String[] args) {
        TriangleOne tester = new TriangleOne();
        String[] tests = {"hippo", "abcd", "it", "a", "chicken"};
        for (String test : tests) {
            tester.setWord(test);
            System.out.println(tester);
        }
    }
}
