package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class CharacterRunner {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CharacterAnalyzer test = new CharacterAnalyzer();
        char[] list = {'A', '1', 'a', '7', 'D', '2', 'X', 'Z', '9'};
        
        for (int i = 0; i <= list.length - 1; i++) {
            System.out.println("Character :: " + list[i]);
            test.setChar(list[i]);
            System.out.println(test);
            
        }
        
        System.out.print("Enter a character :: ");
        char letter = keyboard.next().charAt(0);
        test.setChar(letter);
        System.out.println(test);   //A

        //add more test cases
    }
}
