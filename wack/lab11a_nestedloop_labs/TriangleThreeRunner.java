package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class TriangleThreeRunner {

    public static void main(String args[]) {
        int[] tests = {3, 7, 1, 5, 4};
        String[] testStrings = {"|", "|", "|", "|", "|"};
        // I changed these because on my netbeans the font isn't monospaced,
        // and the letters look spaced wrong, even though it's correct.
        TriangleThree tester = new TriangleThree();
        int index = 0;
        for (String test : testStrings) {
            tester.setTriangle(test, tests[index]);
            System.out.println(tester);
            index++;
        }
    }
}
