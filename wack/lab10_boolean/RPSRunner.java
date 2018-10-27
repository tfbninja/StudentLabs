package lab10_boolean;

import static java.lang.System.*;
import java.util.Scanner;

public class RPSRunner {

    /*
     * Includes a basic AI!
     * If you choose to face it, it will choose whichever move defeats your most
     * often chosen move.
     * Basically, if you always choose rock, you will lose all but 1 or 0 of
     * your games
     */
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        RockPaperScissors game = new RockPaperScissors();
        String choice;
        boolean again = false;
        System.out.print("Are you brave enough to face the mighty AI? ");
        String tempChoice = keyboard.next().substring(0, 1).toLowerCase();
        if (tempChoice.equals("y")) {
            game.setAI(true);
        } else {
            game.setAI(false);
        }

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
