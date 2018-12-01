package lab17a_refs_params_labs;

import java.util.Scanner;

public class LetterBoxesRunner {

    public static void main(String args[]) {
        String response = "";
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter the letter for the box :: ");
            char letter = keyboard.next().trim().charAt(0);
            System.out.print("Enter the size of the box :: ");
            int size = keyboard.nextInt();
            LetterBoxes.printBox(letter, size);
            System.out.print("More input? ");
            response = keyboard.next().trim().toLowerCase().substring(0, 1);
        } while (response.equals("y"));
    }
}
