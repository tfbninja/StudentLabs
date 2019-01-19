package lab20b_elevens;

import java.util.ArrayList;

public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        Card aceSpades = new Card("ACE", "SPADES", 1);
        Card aceHearts = new Card("ACE", "HEARTS", 1);
        Card jackSpades = new Card("jAcK", "Spades", 11);
        Card AceSpades = new Card("ace", "SPADES ", 1);
        System.out.println(aceSpades.matches(aceHearts));
        System.out.println(aceSpades.matches(jackSpades));
        System.out.println(aceSpades.matches(AceSpades));
        System.out.println(aceSpades);
        System.out.println(AceSpades);
    }
}
