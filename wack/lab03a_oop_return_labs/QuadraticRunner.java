package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner {

    public static void main(String[] args) {
        int a, b, c;
        Quadratic test = new Quadratic();

        for (int i = 0; i <= 2; i++) {

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a :: ");
            a = keyboard.nextInt();
            System.out.print("Enter b :: ");
            b = keyboard.nextInt();
            System.out.print("Enter c :: ");
            c = keyboard.nextInt();

            test.dewIt(a, b, c);
        }
    }
}
