package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);

        out.print("Enter the distance :: ");
        int dist = keyboard.nextInt();

        out.print("Enter the hours :: ");
        int hrs = keyboard.nextInt();

        out.print("Enter the minutes :: ");
        int mins = keyboard.nextInt();

        MilesPerHour test = new MilesPerHour(dist, hrs, mins);
        test.calcMPH();
        test.print();

        //add more test cases

        out.print("Enter the distance :: ");
        dist = keyboard.nextInt();

        out.print("Enter the hours :: ");
        hrs = keyboard.nextInt();

        out.print("Enter the minutes :: ");
        mins = keyboard.nextInt();

        test.dewIt(dist, hrs, mins);
        
        out.print("Enter the distance :: ");
        dist = keyboard.nextInt();

        out.print("Enter the hours :: ");
        hrs = keyboard.nextInt();

        out.print("Enter the minutes :: ");
        mins = keyboard.nextInt();

        test.dewIt(dist, hrs, mins);
        
        out.print("Enter the distance :: ");
        dist = keyboard.nextInt();

        out.print("Enter the hours :: ");
        hrs = keyboard.nextInt();

        out.print("Enter the minutes :: ");
        mins = keyboard.nextInt();

        test.dewIt(dist, hrs, mins);
    }
}