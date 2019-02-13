package lab22a_matrices;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TicTacToeRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("tictactoe.dat"));
        file.useDelimiter("");
        while (file.hasNextLine()) {
            String game = file.nextLine();
            prettyPrint(game);
            System.out.println(TicTacToe.evaluate(game));
        }
    }

    public static void prettyPrint(String s) {
        int divider = (int) Math.sqrt(s.length());
        for (int i = 0; i < s.length(); i += divider) {
            System.out.println(spacify(s.substring(i, i + divider)));
        }
    }

    public static String spacify(String s) {
        for (int i = s.length() - 1; i > 0; i--) {
            s = s.substring(0, i) + " " + s.substring(i);
        }
        return s;
    }
}
