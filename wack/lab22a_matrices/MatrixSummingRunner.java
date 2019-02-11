package lab22a_matrices;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MatrixSummingRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("matsum.dat"));
        int[][] m = new int[5][5];
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = file.nextInt();
            }
        }
        format(2, 2, m);
        format(0, 0, m);
        format(4, 3, m);
        format(4, 4, m);
        format(2, 4, m);
        format(1, 3, m);
    }

    public static void format(int r, int c, int[][] m) {
        System.out.println("The sum of " + r + ", " + c + " is " + MatrixSumming.sum(r, c, m));
    }
}
