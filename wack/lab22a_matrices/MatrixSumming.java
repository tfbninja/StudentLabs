package lab22a_matrices;

import java.util.*;
import java.io.*;

public class MatrixSumming {

    public static int sum(int r, int c, int[][] m) {
        return m[r][c] + safeGet(r - 1, c, m) + safeGet(r - 1, c - 1, m)
                + safeGet(r, c - 1, m) + safeGet(r + 1, c - 1, m)
                + safeGet(r + 1, c, m) + safeGet(r + 1, c + 1, m)
                + safeGet(r, c + 1, m) + safeGet(r - 1, c + 1, m);
    }

    public static int safeGet(int r, int c, int[][] m) {
        try {
            return m[r][c];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public String toString() {
        return "";
    }
}
