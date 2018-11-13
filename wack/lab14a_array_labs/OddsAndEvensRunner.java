package lab14a_array_labs;

import java.util.Arrays;
import java.util.Scanner;

public class OddsAndEvensRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Would you like to enter in manual values? ");
        String response = keyboard.nextLine();
        response = response.trim().toLowerCase().substring(0, 1);
        if (response.equals("y")) {
            for (int i = 1; i < 4; i++) {
                System.out.print("Array " + i + ": ");
                String array1 = keyboard.nextLine().trim();
                int[] manualOne = OddsAndEvens.parseString(array1);
                System.out.println("Your array - " + Arrays.toString(manualOne));
                System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(manualOne)));
                System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(manualOne)));
            }
        } else {
            int[] test1 = {2, 4, 6, 8, 10, 12, 14};
            System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(test1)));
            System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(test1)) + "\n");
            int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(test2)));
            System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(test2)) + "\n");
            int[] test3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
            System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(test3)));
            System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(test3)) + "\n");

        }
    }
}
