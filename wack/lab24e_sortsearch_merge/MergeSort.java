package lab24e_sortsearch_merge;

public class MergeSort {

    private static int passCount;

    public static void mergeSort(Comparable[] list) {
        passCount = 0;
        mergeSort(list, 0, list.length);
    }

    public static void mergeSort(Comparable[] list, int front, int back) {
        int mid = (front + back) / 2;
        if (mid != front) {
            mergeSort(list, front, mid);
            mergeSort(list, mid, back);
            merge(list, front, back);
        }
    }

    private static void swap(Comparable[] list, int index1, int index2) {
        Comparable temp = list[index2];
        list[index2] = list[index1];
        list[index1] = temp;
    }

    private static void merge(Comparable[] list, int front, int back) {
        int mid = (front + back) / 2;
        Comparable[] temp = new Comparable[back - front];
        

        System.out.print("pass " + passCount++ + " ");
        MergeSortRunner.prettyPrint(list);
        System.out.println(front + ", " + mid + ", " + back);
    }
}
