package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Discount test = new Discount();
        double amt;
        
        amt = 500; 
        System.out.println("Enter the original bill amount :: " + amt);        
        System.out.println("Bill after discount :: " + test.getDiscountedBill(amt) + "\n");
        
        amt = 2500; 
        System.out.println("Enter the original bill amount :: " + amt);        
        System.out.println("Bill after discount :: " + test.getDiscountedBill(amt) + "\n");
        
        amt = 4000; 
        System.out.println("Enter the original bill amount :: " + amt);        
        System.out.println("Bill after discount :: " + test.getDiscountedBill(amt) + "\n");
        
        amt = 333.33; 
        System.out.println("Enter the original bill amount :: " + amt);        
        System.out.println("Bill after discount :: " + test.getDiscountedBill(amt) + "\n");
        
        amt = 95874.2154;
        System.out.println("Enter the original bill amount :: " + amt);
        System.out.println("Bill after discount :: " + test.getDiscountedBill(amt) + "\n");
        
        System.out.print("Enter the original bill amount :: ");
        amt = keyboard.nextDouble();
        System.out.println("Bill after discount :: " + test.getDiscountedBill(amt));
        

    }
}