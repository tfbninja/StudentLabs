package lab22a_matrices;

public class TicTacToe {

    private char[][] mat;
    private static String x = "x";
    private static String o = "o";

    public static String evaluate(String input) {
        input = input.toLowerCase();
        // init and load matrix
        String[][] board = new String[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = String.valueOf(input.charAt(r * 3 + c));
            }
        }
        String winner = "";
        String winType = "";
        outer:
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (isSame(board[r])) {
                    winner = board[r][c];
                    winType = " wins horizontally!";
                    break outer;
                }
                if (isSame(getColumn(board, c))) {
                    winner = board[r][c];
                    winType = " wins vertically!";
                    break outer;
                }
                if (isSame(getDiagonal(board, true))) {
                    winner = board[0][0];
                    winType = " wins diagonally!";
                    break outer;
                }
                if (isSame(getDiagonal(board, false))) {
                    winner = board[0][board[0].length - 1];
                    winType = " wins diagonally!";
                    break outer;
                }
            }
        }
        if (winType.equals("")) {
            winType = "cat's game - no winner!";
        }
        return winner.toUpperCase() + winType;
    }

    public static String[] getColumn(String[][] matrix, int columnNum) {
        String[] temp = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[i][columnNum];
        }
        return temp;
    }

    public static String[] getDiagonal(String[][] matrix, boolean topLeft) {
        String[] temp = new String[matrix.length];
        if (topLeft) {
            for (int i = 0; i < matrix.length; i++) {
                temp[i] = matrix[i][i];
            }
        } else {
            int count = 0;
            for (int i = matrix.length - 1; i >= 0; i--) {
                temp[i] = matrix[count][i];
                count++;
            }
        }
        return temp;
    }

    public static boolean isSame(String[] list) {
        return list[0].equals(list[1]) && list[0].equals(list[2]);
    }

    public String toString() {
        String output = "";
        return output + "\n\n";
    }
}
