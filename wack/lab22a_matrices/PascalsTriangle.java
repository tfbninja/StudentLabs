package lab22a_matrices;

public class PascalsTriangle {

    private static int[][] mat;

    public PascalsTriangle(int size) {
        mat = new int[size][size];
    }

    public static int getMax(int[][] matrix) {
        int largest = matrix[0][0];
        for (int[] matrix1 : matrix) {
            for (int c = 0; c < matrix1.length; c++) {
                if (matrix1[c] > largest) {
                    largest = matrix1[c];
                }
            }
        }
        return largest;
    }

    public static String makeTriangle(int level) {
        mat = new int[level][level];
        int[][] tempOutput = new int[level][level];
        for (int r = 0; r < tempOutput.length; r++) {
            for (int c = 0; c < tempOutput[r].length; c++) {
                //System.out.println("r = " + r + ", c = " + c);
                tempOutput[r][c] = getNum(r, c);
            }
        }
        String output = "";
        String space = " ";
        int largest = String.valueOf(getMax(tempOutput)).length();
        while (space.length() < largest) {
            space += " ";
        }
        for (int r = 0; r < level; r++) {
            for (int sp = 0; sp < level - r; sp++) {
                output += " ";
            }
            for (int c = 0; c < level; c++) {
                int numSpaces = largest - String.valueOf(tempOutput[r][c]).length();
                output += space;
                if (tempOutput[r][c] > 0) {
                    output += tempOutput[r][c];
                }
            }
            output += "\n";
        }
        return output;
    }

    /*
     * n is row
     * k is column
     */
    public static int getNum(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k < 0 || k > n) {
            return 0;
        }
        //System.out.println(n + ", " + k);
        return getNum(n - 1, k - 1) + getNum(n - 1, k);
    }

    public static int combin(int n, int k) {
        return permut(n, k) / factorial(k);
    }

    public static int permut(int n, int k) {
        return factorial(n) / factorial(n - k);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
            throw new RuntimeException("Cannot take the factorial of the negative number \"" + n + "\"");
        }
        return n * factorial(n - 1);
    }

    /*
    public static int[] getRow(int level) {
        int[] row = new int[level];
        for (int i = 0; i < level; i++) {
            row[i] = 
        }
   }*/
    public void createTriangle() {
    }

    public String toString() {
        String output = "";

        return output;
    }
}
