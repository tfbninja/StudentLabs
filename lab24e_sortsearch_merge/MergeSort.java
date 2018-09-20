package lab24e_sortsearch_merge;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort {

    private static int passCount;

    public static void mergeSort(Comparable[] list) {


        passCount = 0;
        mergeSort(list, 0, list.length);
    }

    private static void mergeSort(Comparable[] list, int front, int back) //O( Log N )
    {
    }

    private static void merge(Comparable[] list, int front, int back) //O(N)
    {
    }
}