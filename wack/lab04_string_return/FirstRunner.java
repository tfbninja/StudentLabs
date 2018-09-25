package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstRunner {

    public static void main(String[] args) {
        FirstAndLast demo = new FirstAndLast("Hello");
        demo.findFirstLastLetters();
        System.out.println("word :: Hello");
        System.out.println("first letter :: " + demo.toString(1));
        System.out.println("last letter :: " + demo.toString(2) + "\n");
        
        demo.setString("World");
        demo.findFirstLastLetters();
        System.out.println("word :: World");
        System.out.println("first letter :: " + demo.toString(1));
        System.out.println("last letter :: " + demo.toString(2) + "\n");
        
        demo.setString("Jukebox");
        demo.findFirstLastLetters();
        System.out.println("word :: Jukebox");
        System.out.println("first letter :: " + demo.toString(1));
        System.out.println("last letter :: " + demo.toString(2) + "\n");
        
        demo.setString("TCEA");
        demo.findFirstLastLetters();
        System.out.println("word :: TCEA");
        System.out.println("first letter :: " + demo.toString(1));
        System.out.println("last letter :: " + demo.toString(2) + "\n");
        
        demo.setString("UIL");
        demo.findFirstLastLetters();
        System.out.println("word :: UIL");
        System.out.println("first letter :: " + demo.toString(1));
        System.out.println("last letter :: " + demo.toString(2));
        

        //add more test cases	

    }
}