package lab04_string_return;

import java.util.Scanner;
// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddRunner {

    public static void main(String[] args) {
        AddStrings demo = new AddStrings("hello", "world");
        demo.add();
        System.out.println(demo);

        demo.setStrings("jim", "bob");
        demo.add();
        System.out.println(demo);

        demo.setStrings("sally", "sue");
        demo.add();
        System.out.println(demo);

        demo.setStrings("computer", "science");
        demo.add();
        System.out.println(demo);

        demo.setStrings("uil", "contests");
        demo.add();
        System.out.println(demo);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("first :: ");
        String frst = keyboard.nextLine();

        System.out.print("last :: ");
        String lst = keyboard.nextLine();

        demo.setStrings(frst, lst);
        demo.add();
        System.out.println("sum :: " + demo);

    }
}
