package lab24d_sortsearch_findmaxprime;

public class MatrixSearch2 {

    private int[][] mat;

    public MatrixSearch2(int rows, int cols, int upper) {
        mat = new int[rows][cols];
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                mat[r][c] = (int) (Math.random() * upper + 1);
            }
        }
    }

    /*
     * findMaxPrime() will return the prime that has the largest surrounding sum
     */
    public int findMaxPrime() {
        int max = 0;
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                if (isPrime(safeCheck(r, c))) {
                    int temp = getCountRndCell(r, c);
                    if (temp > max) {
                        max = safeCheck(r, c);
                    }
                }
            }
        }
        return max;
    }

    public int getCountRndCell(int r, int c) {
        int cnt = safeCheck(r - 1, c - 1) + safeCheck(r - 1, c) + safeCheck(r - 1, c + 1);
        cnt += safeCheck(r, c - 1) + safeCheck(r, c + 1);
        cnt += safeCheck(r + 1, c - 1) + safeCheck(r + 1, c) + safeCheck(r + 1, c + 1);
        return cnt;
    }

    public int safeCheck(int r, int c) {
        try {
            return mat[r][c];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String out = "";
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                out += safeCheck(r, c) + " ";
            }
            out += "\n";
        }
        out += "Max prime = " + findMaxPrime();
        return out;
    }
}
