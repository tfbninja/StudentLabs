package lab18a_advOOP_Monster_lab1_java_aplus;

import java.util.Scanner;

public class MonsterRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Name1: ");
            String name1 = keyboard.next().trim();
            System.out.print("Size1: ");
            int size1 = keyboard.nextInt();
            Monster monsterOne = new Monster(name1, size1);

            System.out.print("Name2: ");
            String name2 = keyboard.next().trim();
            System.out.print("Size2: ");
            int size2 = keyboard.nextInt();
            Monster monsterTwo = new Monster(name2, size2);

            System.out.println("Monster 1 - " + monsterOne);
            System.out.println("Monster 2 - " + monsterTwo);

            if (monsterOne.isSmallerThan(monsterTwo)) {
                System.out.println("Monster one is smaller than monster two.");
            } else if (monsterOne.isBiggerThan(monsterTwo)) {
                System.out.println("Monster one is bigger that monster two.");
            } else {
                System.out.println("Monster one is the same size as monster two.");
            }
            if (monsterOne.namesTheSame(monsterTwo)) {
                System.out.println("Monster one has the same name as monster two.");
            } else {
                System.out.println("Monster one does not have the same name as monster two.");
            }
        }

    }
}
