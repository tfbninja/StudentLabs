package lab22a_matrices;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FancyWordRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("fancyword.dat"));
        file.nextLine();
        while (file.hasNext()) {
            String word = file.next();
            System.out.println(FancyWord.getHourGlass(word));
        }
    }
}
