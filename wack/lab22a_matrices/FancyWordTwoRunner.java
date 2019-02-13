package lab22a_matrices;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FancyWordTwoRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("fancyword.dat"));
        file.nextLine();
        while (file.hasNextLine()) {
            String line = file.nextLine();
            //System.out.println(line + "\n");
            System.out.println(FancyWordTwo.box(line));
        }
    }
}
