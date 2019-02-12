package lab22a_matrices;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GridRunner {

    public static void main(String args[]) throws IOException {
        String[] vals = {"a", "OI BOI", "&", "YEET", "g"};
        Grid test = new Grid(10, 10, vals);
        System.out.println(test);
        System.out.println(test.findMax(vals));
        String[] temp = test.getHitCounts(vals);
        for (String s : temp) {
            System.out.println(s);
        }
    }
}
