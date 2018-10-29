package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne {
    //this lab is setup with a single static method
    //there are no instance variables or additional methods / constructors

    public static String createTriangle(String let, int size) {
        String output = "";
        for (int a = 1; a <= size; a++) {
            for (int b = 1; b <= a; b++) {
                output += let;
            }
            output += "\n";
        }
        return output;
    }
}
