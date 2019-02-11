package lab22a_matrices;

public class Grid {

    private String[][] grid;

    //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                grid[r][c] = pick(vals);
            }
        }
    }

    public String pick(String[] vals) {
        int value = (int) (Math.random() * vals.length);
        return vals[value];
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals) {
        int[] hitCounts = new int[vals.length];
        String[] found = new String[vals.length];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                hitCounts[vals.];
            }
        }
        return "nothing yet";
    }

    //returns a count of how many times val occurs in the matrix
    private int countVals(String val) {
        return 0;
    }

    //display the grid
    public String toString() {
        String output = "";
        return output;
    }
}
