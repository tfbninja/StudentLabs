package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public class ArrayFunHouse {

    //getSum() will return the sum of the numbers from start to stop, including stop
    public static int getSum(int[] numArray, int start, int stop) {
        int total = 0;
        for (int i = start; i <= stop; i++) {
            total += numArray[i];
        }
        return total;
    }

    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for (int i : numArray) {
            if (i == val) {
                count++;
            }
        }
        return count;
    }

    public static int[] removeVal(int[] numArray, int val) {
        int[] newList = new int[numArray.length - getCount(numArray, val)];
        int index = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != val) {
                newList[index] = numArray[i];
                index++;
            }
        }
        return newList;
    }
}
