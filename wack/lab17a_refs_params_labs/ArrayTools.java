package lab17a_refs_params_labs;

public class ArrayTools {

    //sumSection will return the sum of the numbers 
    //from start to stop, not including stop
    public static int sumSection(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    //countVal will return a count of how many times val is present in numArray
    public static int countVal(int[] numArray, int val) {
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == val) {
                count++;
            }
        }
        return count;
    }
}
