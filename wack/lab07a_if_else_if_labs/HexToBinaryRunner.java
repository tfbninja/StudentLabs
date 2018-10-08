package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;

public class HexToBinaryRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        HexToBinary test = new HexToBinary('A');

        System.out.println("Enter a letter :: A\n" + test + "\n");

        test.setHex('B');
        System.out.println("Enter a letter :: B\n" + test + "\n");

        test.setHex('C');
        System.out.println("Enter a letter :: C\n" + test + "\n");

        test.setHex('D');
        System.out.println("Enter a letter :: D\n" + test + "\n");

        test.setHex('E');
        System.out.println("Enter a letter :: E\n" + test + "\n");

        test.setHex('F');
        System.out.println("Enter a letter :: F\n" + test + "\n");

        test.setHex('X');
        System.out.println("Enter a letter :: X\n" + test + "\n");

        System.out.print("Enter a letter :: ");
        test.setHex(keyboard.nextLine().charAt(0));
        System.out.println(test);
    }
}
