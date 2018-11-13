package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
import java.util.Arrays;

//Name -
//Date -
//Class - 
//Lab  -
public class ArrayFunHouseTwoRunner {

    public static void main(String args[]) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test2 = {1, 2, 3, 9, 11, 20, 30};
        int[] test3 = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
        int[] test4 = {3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0};
        System.out.println(Arrays.toString(test1));
        System.out.println("is going up ?  " + FunHouseTwo.goingUp(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println("is going up ?  " + FunHouseTwo.goingUp(test2));
        System.out.println(Arrays.toString(test3));
        System.out.println("is going up ?  " + FunHouseTwo.goingUp(test3));
        System.out.println(Arrays.toString(test4));
        System.out.println("is going up ?  " + FunHouseTwo.goingUp(test4) + "\n");

        System.out.println(Arrays.toString(test1));
        System.out.println("is going down ?  " + FunHouseTwo.goingDown(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println("is going down ?  " + FunHouseTwo.goingDown(test2));
        System.out.println(Arrays.toString(test3));
        System.out.println("is going down ?  " + FunHouseTwo.goingDown(test3));
        System.out.println(Arrays.toString(test4));
        System.out.println("is going down ?  " + FunHouseTwo.goingDown(test4) + "\n");

        System.out.println(Arrays.toString(test4));
        System.out.println("first 7 values greater than 9  " + Arrays.toString(FunHouseTwo.valCountAboveX(test4, 7, 9)));
        System.out.println("first 5 values greater than 15  " + Arrays.toString(FunHouseTwo.valCountAboveX(test4, 5, 15)));
    }
}
