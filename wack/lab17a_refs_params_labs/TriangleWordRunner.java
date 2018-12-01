package lab17a_refs_params_labs;

import java.util.Scanner;

public class TriangleWordRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String response = "";

        do {
            System.out.print("Enter a word :: ");
            String word = keyboard.next();
            TriangleWord.printTriangle(word);
            System.out.print("Again? ");
            response = keyboard.next().trim().toLowerCase().substring(0, 1);
        } while (response.equals("y"));
    }
}
