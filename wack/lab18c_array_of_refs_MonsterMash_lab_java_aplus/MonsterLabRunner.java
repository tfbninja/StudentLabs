package lab18c_array_of_refs_MonsterMash_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class MonsterLabRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);

        out.print("How many monsters are in the herd? :: ");
        int size = keyboard.nextInt();
        Monsters herd = new Monsters(size);

        for (int i = 0; i < size; i++) {
            //read in monster values 
            //ask for ht
            //ask for wt
            //ask for age
            //instantiate a new Monster() and add it to the herd			
        }

        System.out.println("HERD :: " + herd + "\n");
        //print out the other stats

    }
}