package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class TriangleThreeRunner {

    public static void main(String args[]) {
        int[] tests = {3, 7, 1, 5, 4};
        String[] testStrings = {"A", "X", "R", "T", "W"};
        TriangleThree tester = new TriangleThree();
        int index = 0;
        for (String test : testStrings) {
            tester.setTriangle(test, tests[index]);
            System.out.println(tester);
            index++;
        }
    }
}
