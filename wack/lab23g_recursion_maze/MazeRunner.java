package lab23g_recursion_maze;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeRunner {

    public static void main(String args[]) throws IOException {
        Maze maze = new Maze();
        Scanner s = new Scanner(new File("maze.dat"));
        while (s.hasNextInt()) {
            int size = s.nextInt();
            int[][] mz = new int[size][size];
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    mz[r][c] = s.nextInt();
                }
            }
            s.nextLine();
            maze.setMaze(mz);
            System.out.println(maze + "\n");
        }
    }
}
