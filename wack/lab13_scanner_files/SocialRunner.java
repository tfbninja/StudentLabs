package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SocialRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("social.dat"));
        Social tester = new Social();
        file.useDelimiter("-");
        file.nextLine();
        while (file.hasNextLine()) {
            tester.setSocial(file.nextLine()); // eliminate printing "SS# has a sum of 0"
            if (!tester.getLine().equals("")) {
                System.out.println(tester);
            }
        }

    }
}
