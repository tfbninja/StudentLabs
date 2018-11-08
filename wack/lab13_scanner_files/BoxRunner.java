package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BoxRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("box.dat"));
        file.nextLine();
        Box tester = new Box();
        while (file.hasNextLine()) {
            tester.setLetter(file.next());
            tester.setSize(file.nextInt());
            file.nextLine();
            if (!(tester.getLetter().equals("")) || !(tester.getSize() == 0)) {
                System.out.println("Boring box: \n" + tester.toString().trim() + "\n");
                System.out.println("Better box: \n" + tester.coolBox().trim() + "\n");
                System.out.println("Best box: \n" + tester.evenCoolerBox().trim() + "\n");
            }
        }
    }
}
