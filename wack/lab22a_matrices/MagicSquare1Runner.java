package lab22a_matrices;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare1Runner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("magic1.dat"));
        int numTests = file.nextInt();
        int index = 0;
        while (index < numTests) {
            int squareRadius = file.nextInt();
            file.nextLine();
            int[][] square = new int[squareRadius][squareRadius];
            for (int i = 0; i < Math.pow(squareRadius, 2); i++) {
                square[i / squareRadius][i % squareRadius] = file.nextInt();
            }
            prettyPrint(square);
            System.out.println(MagicSquare1.isMagicSquare(square));
            file.nextLine();
            index++;
        }
    }

    public static void prettyPrint(int[][] mat) {
        for (int[] r : mat) {
            for (int rc : r) {
                System.out.print(rc + " ");
            }
            System.out.println("");
        }
    }
}
