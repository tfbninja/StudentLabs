package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Distance test = new Distance();
        int x1,x2,y1,y2;
        for (int i = 0; i <= 2; i++){
            System.out.print("Enter X1 :: ");
            x1 = keyboard.nextInt();
            System.out.print("Enter Y1 :: ");
            y1 = keyboard.nextInt();
            System.out.print("Enter X2 :: ");
            x2 = keyboard.nextInt();
            System.out.print("Enter Y2 :: ");
            y2 = keyboard.nextInt();
            test.dewIt(x1, y1, x2, y2);
        }
    }
}