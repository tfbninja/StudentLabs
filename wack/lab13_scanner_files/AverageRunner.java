package lab13_scanner_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AverageRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("average.dat"));
        Average tester = new Average();
        file.nextLine();
        while (file.hasNextLine()) {
            tester.setLine(file.nextLine());
            System.out.println(tester.getLine());
            System.out.println(tester + "\n");
        }
    }
}
