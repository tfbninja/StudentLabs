package lab23c_recursion_at_counter;

public class AtCounter {

    private String[][] mat;
    private int[][] used;

    public AtCounter() {
        mat = new String[10][10];
        used = new int[10][10];

        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                mat[r][c] = Math.random() < 0.5 ? "@" : "-";
            }
        }
    }

    public int formatUsed() {
        for (int r = 0; r < used.length; r++) {
            for (int c = 0; c < used[r].length; c++) {
                used[r][c] = 0;
            }
        }
        return 0;
    }

    public int count(int[][] list) {
        int counter = 0;
        for (int[] list1 : list) {
            for (int c = 0; c < list1.length; c++) {
                if (list1[c] != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int count() {
        int counter = 0;
        for (String[] list1 : mat) {
            for (String c : list1) {
                if (c.equals("@")) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int[] getRandomAt() {
        int[] pos = {0, 0};
        int which = (int) (Math.random() * count());
        int counter = 0;
        for (int r = 0; r < used.length; r++) {
            for (int c = 0; c < used[r].length; c++) {
                if (mat[r][c].equals("@")) {
                    counter++;
                    if (counter == which) {
                        pos[0] = r;
                        pos[1] = c;
                        return pos;
                    }
                }

            }
        }
        return null;
    }

    public int countAts(int r, int c) {
        if (r < 0 || c < 0 || r > mat.length - 1 || c > mat[r].length - 1) {
            return 0;
        }
        if (used[r][c] == 1) {
            return 0;
        }
        String self = mat[r][c];
        if (self.equals("@")) {
            used[r][c] = 1;
            if (count(used) == 1) {
                return 1 + countAts(r + 1, c) + countAts(r, c + 1) + countAts(r - 1, c) + countAts(r, c - 1) + formatUsed();
            } else {
                return 1 + countAts(r + 1, c) + countAts(r, c + 1) + countAts(r - 1, c) + countAts(r, c - 1);
            }
        }
        return 0;
    }

    /*
     * this method will return all values in the matrix
     * this method should return a view of the matrix
     * that looks like a matrix
     */
    public String toString() {
        String s = "";
        for (String[] r : mat) {
            for (String x : r) {
                s += x + " ";
            }
            s += "\n";
        }
        return s;
    }
}
