package lab22a_matrices;

import java.util.Arrays;

public class FancyWordTwo {

    public static String box(String input) {
        int len = input.length();
        String[][] matrix = new String[len][len];
        for (String[] sl : matrix) {
            Arrays.fill(sl, " ");
        }
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                if (r == 0) {
                    matrix[r][c] = String.valueOf(input.charAt(c));
                } else if (c == 0) {
                    matrix[r][c] = String.valueOf(input.charAt(r));
                } else if (c == len - 1) {
                    matrix[r][c] = String.valueOf(input.charAt(len - r - 1));
                } else if (r == len - 1) {
                    matrix[r][c] = String.valueOf(input.charAt(len - c - 1));
                }
            }
        }
        String output = "";
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                output += matrix[r][c];
            }
            output += "\n";
        }
        return output;
    }
}
