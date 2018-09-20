package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.lang.Math.*;

public class TriangleRunner //this class is used to test Triangle
{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //ask for user input
        System.out.print("Enter side A ::  ");
        int a = keyboard.nextInt();

        System.out.print("Enter side B ::  ");
        int b = keyboard.nextInt();

        System.out.print("Enter side C ::  ");
        int c = keyboard.nextInt();


        Triangle test = new Triangle(a, b, c);
        test.calcPerimeter();
        test.calcArea();
        test.print();
        System.out.println("\n\n");


        //ask for user input
        System.out.print("Enter side A ::  ");
        a = keyboard.nextInt();

        System.out.print("Enter side B ::  ");
        b = keyboard.nextInt();

        System.out.print("Enter side C ::  ");
        c = keyboard.nextInt();

        test.dewIt(a, b, c); // this does all of the methods in order so you don't have to type it all everytime
        System.out.println("\n\n");

        //add one more input section
        System.out.print("Enter side A ::  ");
        a = keyboard.nextInt();
        
        System.out.print("Enter side B ::  ");
        b = keyboard.nextInt();
        
        System.out.print("Enter side C ::  ");
        c = keyboard.nextInt();
        
        test.dewIt(a, b, c);



    }
}