package lab15_sort_search_24;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearchRunner {

    public static void main(String args[]) throws IOException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
        int find = 5;
        out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");

        //add more case
    }
}
