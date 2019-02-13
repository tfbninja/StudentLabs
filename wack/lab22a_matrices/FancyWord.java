package lab22a_matrices;

import java.util.Arrays;
import java.util.Scanner;

public class FancyWord {

    private static String[][] mat;

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
        getHourGlass(s);
    }

    public static String getHourGlass(String word) {
        mat = new String[word.length()][word.length()];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = new String[word.length()];
            Arrays.fill(mat[i], " ");
        }
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                if (r == c) {
                    mat[r][c] = String.valueOf(word.charAt(r));

                } else if (r + c == word.length() - 1) {
                    mat[r][c] = String.valueOf(word.charAt(c));

                } else if (r == 0 || r == word.length() - 1) {
                    mat[r][c] = String.valueOf(word.charAt(c));
                }
            }
        }
        String output = "\n";
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat.length; c++) {
                output += mat[r][c] + " ";
            }
            output += "\n";
        }
        return output;
    }

    public String toString() {
        String output = "\n";
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat.length; c++) {
                output += mat[r][c] + " ";
            }
            output += "\n";
        }
        return output;
    }
}
