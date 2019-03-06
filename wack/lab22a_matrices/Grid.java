package lab22a_matrices;

public class Grid {

    private String[][] grid;

    //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals) {
        grid = new String[rows][cols];
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
        int i = 0;
        for (String s : vals) {
            hitCounts[i] = countVals(s);
            i++;
        }
        int highestIndex = 0;
        int currentIndex = 0;
        for (int j : hitCounts) {
            if (j > hitCounts[highestIndex]) {
                highestIndex = currentIndex;
            }
            currentIndex++;
        }
        return vals[highestIndex];
    }

    //returns a count of how many times val occurs in the matrix
    private int countVals(String val) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c].equals(val)) {
                    count++;
                }
            }
        }
        return count;
    }

    public String[] getHitCounts(String[] vals) {
        String[] output = vals;
        for (int i = 0; i < output.length; i++) {
            output[i] += " - " + countVals(output[i]);
        }
        return output;
    }

    //display the grid
    public String toString() {
        String output = "";
        for (String[] sl : grid) {
            for (String s : sl) {
                output += s + " ";
            }
            output += "\n";
        }
        return output;
    }
}
