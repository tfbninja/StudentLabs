package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class TriangleTwoRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String choice = "";
        do {
            out.print("Enter the size of the triangle : ");
            int big = keyboard.nextInt();
            out.print("Enter a letter : ");
            String value = keyboard.next();

            //instantiate a TriangleTwo object
            TriangleTwo tw = new TriangleTwo(value, big);
            //call the toString method to print the triangle 
            System.out.println(tw);

            System.out.print("Do you want to enter more data? ");
            choice = keyboard.next().substring(0, 1).toLowerCase();
        } while (choice.equals("y"));
    }
}
