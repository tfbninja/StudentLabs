package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner {

    public static void main(String[] args) {
        StringOddOrEven demo = new StringOddOrEven();
        String[] tests = {"cat", "boot", "it", "a", "eleven", "thirteen", "odd", "even"};
        for (int i = 0; i <= tests.length - 1; i++) {
            String word = tests[i];
            System.out.println("Word :: " + word);
            demo.setString(word);
            demo.isEven();
            System.out.println(demo.toString() + "\n");
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word :: ");
        String testWord = keyboard.nextLine();
        demo.setString(testWord);
        demo.isEven();
        System.out.println(demo.toString());
    }
}
