package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class TriangleFourRunner {

    public static void main(String args[]) {
        TriangleFour tester = new TriangleFour();
        String[] testStrings = {"R", "B", "X", "E", "T"};
        int[] testSizes = {3, 4, 5, 2, 1};
        int index = 0;
        for (String testString : testStrings) {
            tester.setTriangle(testString, testSizes[index]);
            System.out.println(tester);
            index++;
        }
    }
}
