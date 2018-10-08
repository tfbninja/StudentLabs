package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;

public class GradeCheck {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Grade test = new Grade(78);
        System.out.println("Enter a number grade :: 78\n" + test);

        test.setGrade(92);
        System.out.println("Enter a number grade :: 92\n" + test);

        test.setGrade(31);
        System.out.println("Enter a number grade :: 31\n" + test);

        test.setGrade(82);
        System.out.println("Enter a number grade :: 82\n" + test);

        test.setGrade(77);
        System.out.println("Enter a number grade :: 77\n" + test);

        test.setGrade(73);
        System.out.println("Enter a number grade :: 73\n" + test);

        test.setGrade(55);
        System.out.println("Enter a number grade :: 55\n" + test);

        test.setGrade(65);
        System.out.println("Enter a number grade :: 65\n" + test);

        System.out.print("Enter a number grade :: ");
        test.setGrade(keyboard.nextInt());
        System.out.println(test);

    }
}
