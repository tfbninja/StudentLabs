package lab18c_array_of_refs_MonsterMash_lab_java_aplus;

import lab19b_interfaces_Monster_lab2_java_aplus.Monster;
import static java.lang.System.*;
import java.util.Scanner;

public class MonsterLabRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);

        out.print("How many monsters are in the herd? :: ");
        int size = skimDigits(keyboard.nextLine());
        Monsters herd = new Monsters(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the ht :: ");
            Monster tempM = new Monster();
            tempM.setHeight(skimDigits(keyboard.nextLine()));

            System.out.print("Enter the wt :: ");
            tempM.setSize(skimDigits(keyboard.nextLine()));

            System.out.print("Enter the age :: ");
            tempM.setAge(skimDigits(keyboard.nextLine()));
            System.out.println("\n\n");
            herd.add(tempM);
        }

        System.out.println("HERD :: " + herd + "\n");
        System.out.println("SMALLEST :: " + herd.getSmallest() + "\n");
        System.out.println("LARGEST :: " + herd.getLargest() + "\n");
    }

    public static int skimDigits(String input) {
        return Integer.valueOf(input.replaceAll("\\D", ""));
    }
}
