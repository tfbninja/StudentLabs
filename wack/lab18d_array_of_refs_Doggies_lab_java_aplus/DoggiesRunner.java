package lab18d_array_of_refs_Doggies_lab_java_aplus;

import java.util.Scanner;

public class DoggiesRunner {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many Dogs are in the pack? :: ");
        int size = skimDigits(keyboard.nextLine());
        Pack pack = new Pack(size);

        for (int i = 0; i < size; i++) {
            Dog tempD = new Dog();
            System.out.print("Enter the age :: ");
            tempD.setAge(skimDigits(keyboard.nextLine()));
            System.out.print("Enter the name :: ");
            tempD.setName(keyboard.nextLine().replaceAll("\\s", ""));
            pack.add(tempD);
            System.out.println("");
        }
        System.out.println("pack :: " + pack);
        System.out.println("NAME OF OLDEST :: " + pack.getNameOfOldest());
        System.out.println("NAME OF YOUNGEST :: " + pack.getNameOfYoungest());
    }

    public static int skimDigits(String input) {
        return Integer.valueOf(input.replaceAll("\\D", ""));
    }
}
