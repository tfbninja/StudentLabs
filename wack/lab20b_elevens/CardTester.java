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
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(aceSpades);
        cards.add(aceHearts);
        cards.add(jackSpades);
        cards.add(AceSpades);
        for (Card c : cards) {
            System.out.println(c.toString() + " " + c.matches(aceHearts));
            System.out.println(c.conciseToString());
            System.out.println(c.pointValue());
            System.out.println(c.rank());
            System.out.println(c.suit());
        }
    }
}
