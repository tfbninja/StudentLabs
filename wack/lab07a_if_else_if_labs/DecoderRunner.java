package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class DecoderRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Decoder test = new Decoder();

        test.setLetter('a');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        test.setLetter('A');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        test.setLetter('b');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        test.setLetter('0');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        test.setLetter('t');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        test.setLetter('*');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        test.setLetter('h');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        test.setLetter('T');
        System.out.println("Enter a letter :: " + test.getLetter() + "\n" + test);

        System.out.print("Enter a letter :: ");
        test.setLetter(keyboard.nextLine().charAt(0));
        System.out.println(test);

    }
}