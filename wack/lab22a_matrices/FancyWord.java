package lab22a_matrices;

import java.util.Arrays;
import java.util.Scanner;

public class FancyWord {

    private String[][] mat;

    public FancyWord(String s) {
        mat = new String[s.length()][s.length()];
        Arrays.fill(mat, " ");
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat.length; c++) {
                if (r == c) {
                    mat[r][c] = String.valueOf(s.charAt(r));
                }
                if (s.length() - r == c) {
                    mat[r][c] = String.valueOf(s.charAt(c));
                }
            }
        }
    }

    public static String getHourGlass(String word) {
        String output = "";
        return output;
    }

    public String toString() {
        String output = "";
        return output + "\n\n";
    }
}
