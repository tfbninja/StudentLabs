package lab13_scanner_files;

import java.util.Scanner;
import static java.lang.System.*;
import java.io.IOException;
import java.io.File;

public class AverageRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("average.dat"));
        Average tester = new Average();
        file.next();
        while (file.hasNextLine()) {
            System.out.println(tester.setLine(file.nextLine()));
            System.out.println(tester.getAverage());
        }
    }
}
