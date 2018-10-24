package lab10_boolean;

import static java.lang.System.*;
import java.util.Scanner;

public class RPSRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        RockPaperScissors game = new RockPaperScissors();
        String choice;
        boolean again = false;
        //add in a do while loop after you get the basics up and running

        do {
            out.print("type in your prompt [R,P,S,L,K] :: ");
            choice = keyboard.next();
            game.setPlayers(choice);
            game.setComputer();
            System.out.println(game);
            System.out.print("Do you want to play again?: ");
            String temp = keyboard.next();
            temp = temp.substring(0, 1).toLowerCase();
            if (temp.equals("y")) {
                again = true;
            } else {
                again = false;
            }

        } while (again);

    }
}
