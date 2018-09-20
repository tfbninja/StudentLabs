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

public class WordSortTwoRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("wordsorttwo.dat"));
        int size = file.nextInt();
        file.nextLine();
        for (int i = 0; i < size; i++) {
            String sentence = file.nextLine();
            //instantiate a new WordSort
        }
    }
}