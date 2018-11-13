package lab14a_array_labs;

public class FunHouseTwo {
    //goingUp() will return true if all numbers
    //in numArray are in increasing order
    //[1,2,6,9,23] returns true
    //[9, 11, 13, 8]  returns false

    public static boolean goingUp(int[] numArray) {
        int index = 0;
        for (int i : numArray) {
            if (index + 1 < numArray.length && numArray[index + 1] <= i) {
                return false;
            }
            index++;
        }
        return true;
    }

    //goingDown() will return true if all numbers
    //in numArray are in decreasing order
    //[31,12,6,2,1] returns true
    //[31, 20, 10, 15, 9] returns false
    public static boolean goingDown(int[] numArray) {
        int index = 0;
        for (int i : numArray) {
            if (index + 1 < numArray.length && numArray[index + 1] >= i) {
                return false;
            }
            index++;
        }
        return true;
    }

    //getValuesBiggerThanX will return an array that contains
    //count number of values that are larter than parameter x
    //[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
    public static int[] valCountAboveX(int[] numArray, int count, int x) {
        int[] newArray = new int[count];
        int index = 0;
        for (int i : numArray) {
            if (i > x) {
                newArray[index] = i;
                index++;
            }
            if (index >= count) {
                break;
            }
        }
        return newArray;
    }
}
