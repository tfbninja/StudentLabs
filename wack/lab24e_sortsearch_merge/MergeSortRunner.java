package lab24e_sortsearch_merge;

import java.util.Arrays;

public class MergeSortRunner {

    public static void main(String args[]) {
        Comparable[][] tests = {{9, 5, 3, 2}, {19, 52, 3, 2, 7, 21}, {68, 66, 11, 2, 42, 31}};
        for (Comparable[] t : tests) {
            //prettyPrint(t);
            MergeSort.mergeSort(t);
            //prettyPrint(t);
            System.out.println("");
        }
    }

    public static void prettyPrint(Comparable[] c) {
        System.out.println(Arrays.deepToString(c));
    }
}
