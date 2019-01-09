package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TenToAnyRunner {

    public static void main(String args[]) {
        //add test cases	
        int[] testNums = {256, 100, 10, 15, 256, 100, 250, 56, 89, 23, 50, 55, 2500};
        int[] testBases = {16, 2, 2, 2, 2, 8, 16, 11, 5, 3, 5, 6, 6};
        TenToAny tester = new TenToAny();
        for (int i = 0; i < testNums.length; i++) {
            tester.set(testNums[i], testBases[i]);
            System.out.println(tester);
        }

    }
}
