package lab23f_recursion_garbage;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid {

    private ColoredCell[][] grid;

    public Grid() {
        setSize(0, 0);
    }

    public Grid(int rows, int cols) {
        setSize(rows, cols);
    }

    public void setSize(int rows, int cols) {
        grid = new ColoredCell[rows][cols];
    }

    public void setSpot(int r, int c, ColoredCell v) {
        grid[r][c] = v;
    }

    public ColoredCell getSpot(int row, int col) {
        return grid[row][col];
    }

    public int getNumRows() {
        return grid.length;
    }

    public int getNumCols() {
        return grid[0].length;
    }

    public boolean drawGrid(Graphics window) {
        boolean full = true;

        //for loop for row
        for (int r = 0; r < grid.length; r++) {
            //for loop for col
            for (int c = 0; c < grid[r].length; c++) {
                ColoredCell spot = grid[r][c];

                //if the current spot is not null
                if (spot != null) {
                    spot.draw(window);
                }
            }
        }
        return full;
    }

    @Override
    public String toString() {
        String output = "";
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] != null) {
                    output += grid[r][c].toString();
                }
                output += "\n";
            }
        }
        return output;
    }
}
