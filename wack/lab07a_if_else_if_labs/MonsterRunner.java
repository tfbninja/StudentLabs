package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;

public class MonsterRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        Monster Monster1 = new Monster("Tom", 2);
        Monster Monster2 = new Monster("Bob", 4);

        System.out.println("Enter 1st monster's name : " + Monster1.getName());
        System.out.println("Enter 1st monster's size : " + Monster1.getHowBig());
        System.out.println("Enter 2nd monster's name : " + Monster2.getName());
        System.out.println("Enter 2nd monster's size : " + Monster2.getHowBig() + "\n");

        System.out.println("Monster 1" + Monster1);
        System.out.println("Monster 2" + Monster2 + "\n");
        System.out.println(format(Monster1, Monster2));

        Monster1 = new Monster("Sally", 7);
        Monster2 = new Monster("Fred", 2);

        System.out.println("Enter 1st monster's name : " + Monster1.getName());
        System.out.println("Enter 1st monster's size : " + Monster1.getHowBig());
        System.out.println("Enter 2nd monster's name : " + Monster2.getName());
        System.out.println("Enter 2nd monster's size : " + Monster2.getHowBig() + "\n");

        System.out.println("Monster 1" + Monster1);
        System.out.println("Monster 2" + Monster2 + "\n");
        System.out.println(format(Monster1, Monster2));

        Monster1 = new Monster("Ann", 1);
        Monster2 = new Monster("Ann", 4);

        System.out.println("Enter 1st monster's name : " + Monster1.getName());
        System.out.println("Enter 1st monster's size : " + Monster1.getHowBig());
        System.out.println("Enter 2nd monster's name : " + Monster2.getName());
        System.out.println("Enter 2nd monster's size : " + Monster2.getHowBig() + "\n");

        System.out.println("Monster 1" + Monster1);
        System.out.println("Monster 2" + Monster2 + "\n");
        System.out.println(format(Monster1, Monster2));

    }

    public static String format(Monster one, Monster two) {
        String relSize = "";
        String sameName = "";

        if (one.isBigger(two)) {
            relSize = "bigger";
        } else {
            relSize = "smaller";
        }
        if (one.namesTheSame(two)) {
            sameName = "has";
        } else {
            sameName = "does not have";
        }
        return "Monster one is " + relSize + " than Monster two.\nMonster one " + sameName + " the same name as Monster two\n\n\n";
    }
}
