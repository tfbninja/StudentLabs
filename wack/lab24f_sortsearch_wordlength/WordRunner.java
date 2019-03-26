package lab24f_sortsearch_wordlength;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("words.dat"));

        ArrayList<Word> words = new ArrayList<Word>();
        while (file.hasNextLine()) {
            words.add(new Word(file.nextLine()));
        }

        Collections.sort(words);

        for (Word w : words) {
            System.out.println(w);
        }
    }
}
