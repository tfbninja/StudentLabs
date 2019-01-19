package lab20b_elevens;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private ArrayList<Card> cards = new ArrayList<>();

    /**
     * size is the number of not-yet-dealt cards. Cards are dealt from the top
     * (highest index) down. The next card to be dealt is at size - 1.
     */
    private int size;

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It auto populates a standard 52 card deck sans jokers/
     */
    public Deck() {
        size = 52;
        for (int suitnum = 1; suitnum <= 4; suitnum++) {
            for (int ranknum = 1; ranknum <= 13; ranknum++) {
                this.cards.add(new Card(Card.intToRank(ranknum), Card.intToSuit(suitnum), ranknum));
            }
        }
    }

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits, and produces
     * one of the corresponding card.
     *
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        size = ranks.length;
        for (int i = 0; i < size; i++) {
            cards.add(new Card(ranks[i], suits[i], values[i]));
        }
    }

    /**
     * Determines if this deck is empty (no undealt cards).
     *
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return cards.size() == size;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     *
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return size;
    }

    /**
     * Randomly permute the given collection of cards and reset the size to
     * represent the entire deck.
     */
    public void shuffle() {
        size = cards.size();
        Collections.shuffle(cards);
    }

    /**
     * Deals a card from this deck.
     *
     * @return the card just dealt, or null if all the cards have been
     * previously dealt.
     */
    public Card deal() {
        if (size == 0) {
            return null;
        }
        cards.add(cards.remove(size - 1));
        size--;
        return cards.get(cards.size() - 1);
    }

    /**
     * Generates and returns a string representation of this deck.
     *
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn += cards.get(k).conciseToString();
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if (k % 26 == 0) {
                rtn += "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = size; k <= cards.size() - 1; k++) {
            rtn += cards.get(k).conciseToString();
            if (k != cards.size()) {
                rtn = rtn + ", ";
            }
        }
        rtn += "\n";
        return rtn;
    }
}
