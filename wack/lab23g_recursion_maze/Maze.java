package lab23g_recursion_maze;

public class Maze {

    private int[][] maze;
    private int[][] used;
    private int shortest = 0;

    public Maze() {

    }

    public Maze(int[][] mz) {
        maze = mz;
        formatUsed();
    }

    public void setMaze(int[][] mz) {
        maze = mz;
        formatUsed();
        resetShortest();
    }

    public boolean formatUsed() {
        used = new int[maze.length][maze[0].length];
        for (int r = 0; r < used.length; r++) {
            for (int c = 0; c < used[r].length; c++) {
                used[r][c] = 0;
            }
        }
        return false;
    }

    public void resetShortest() {
        shortest = 0;
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

    public boolean hasExitPath(int r, int c) {
        if (r < 0 || c < 0 || r > maze.length - 1 || c > maze[r].length - 1) {
            return false;
        }
        int self = maze[r][c];
        if (self == 0) {
            return false;
        }

        if (c == maze.length - 1 && self > 0) {
            maze[r][c] = 2;
            return true;
        }
        if (used[r][c] == 1) {
            return false;
        }
        if (self > 0) {
            used[r][c] = 1;
            shortest++;
            maze[r][c] = 2;
            if (count(used) == 1) {
                return hasExitPath(r + 1, c) || hasExitPath(r, c + 1) || hasExitPath(r - 1, c) || hasExitPath(r, c - 1) || formatUsed();
            } else {
                return hasExitPath(r + 1, c) || hasExitPath(r, c + 1) || hasExitPath(r - 1, c) || hasExitPath(r, c - 1);
            }
        }
        return false;
    }

    public void resetMaze() {
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[r].length; c++) {
                switch (maze[r][c]) {
                    case 2:
                        maze[r][c] = 1;
                        break;
                }
            }
        }
    }

    public String toString() {
        String output = "";
        boolean path = hasExitPath(0, 0);
        if (!path) {
            resetMaze();
        }
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[r].length; c++) {
                if (maze[r][c] != 2) {
                    output += maze[r][c] + " ";
                } else {
                    output += "P ";
                }
            }
            output += "\n";
        }
        output += "exit ";
        formatUsed();
        if (path) {
            output += "found - " + shortest + " steps";
            return output;
        }

        output += "not found";
        return output;
    }
}
