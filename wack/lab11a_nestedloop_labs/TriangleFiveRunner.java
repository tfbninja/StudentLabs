package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class TriangleFiveRunner {

    public static void main(String args[]) {
        char[] testChars = {'C', 'A', 'B', 'X', 'Z'};
        int[] testNums = {4, 5, 7, 6, 8};
        TriangleFive tester = new TriangleFive();
        for (int i = 0; i < testChars.length; i++) {
            tester.setAmount(testNums[i]);
            tester.setLetter(testChars[i]);
            System.out.println(tester);
        }
    }
}
