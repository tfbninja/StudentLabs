package lab22a_matrices;

public class MagicSquare1 {

    public static String isMagicSquare(int[][] square) {
        int downDiag = sumDownDiag(square);
        int upDiag = sumUpDiag(square);
        int row = sumRow(square, 0);
        int col = sumCol(square, 0);
        boolean isMagic = downDiag == upDiag && row == col && row == downDiag;
        outer:
        for (int r = 0; r < square.length; r++) {
            for (int c = 0; c < square[r].length; c++) {
                isMagic = isMagic && sumRow(square, r) == row;
                isMagic = isMagic && sumCol(square, c) == col;
                if (!isMagic) {
                    break outer;
                }
            }
        }
        if (isMagic) {
            return "MAGIC SQUARE";
        } else {
            return "NOT A MAGIC SQUARE";
        }
    }

    public static int sumRow(int[][] list, int r) {
        int sum = 0;
        for (int i : list[r]) {
            sum += i;
        }
        return sum;
    }

    public static int sumCol(int[][] list, int c) {
        int sum = 0;
        for (int[] list1 : list) {
            sum += list1[c];
        }
        return sum;
    }

    public static int sumDownDiag(int[][] list) {
        int sum = 0;
        for (int r = 0; r < list.length; r++) {
            sum += list[r][r];
        }
        return sum;
    }

    public static int sumUpDiag(int[][] list) {
        int sum = 0;
        for (int r = 0; r < list.length; r++) {
            sum += list[list.length - r - 1][r];
        }
        return sum;
    }
}
