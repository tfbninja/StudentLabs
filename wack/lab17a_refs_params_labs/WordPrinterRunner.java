package lab17a_refs_params_labs;

import static java.lang.System.*;
import java.util.Scanner;

public class WordPrinterRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String choice = "";
        do {
            out.print("\nEnter the word to display :: ");
            String word = keyboard.next();

            out.print("Enter the times to display :: ");
            int times = keyboard.nextInt();

            WordPrinter.printWord(word, times);
            System.out.print("\nDo you want to enter more sample input? ");
            choice = keyboard.next().toLowerCase().trim().substring(0);
        } while (choice.equals("y"));
    }
}
