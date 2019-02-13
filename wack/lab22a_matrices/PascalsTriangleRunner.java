package lab22a_matrices;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PascalsTriangleRunner {

    public static void main(String args[]) throws IOException {
        //testPascal();
        Scanner file = new Scanner(new File("triangle.dat"));
        file.nextLine();
        while (file.hasNextInt()) {
            int temp = file.nextInt();
            System.out.println(PascalsTriangle.makeTriangle(temp));
        }
    }

    public static void testPascal() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(PascalsTriangle.getNum(i, j));
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
