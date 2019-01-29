package lab20b_elevens;

public class Card {

    /*
     * Suits: SPADES, CLUBS, DIAMONDS, HEARTS
     * Ranks: A, 2, 3, 4, 5, 6, 7, 8, 9
     */
    /**
     * String value that holds the suit of the card
     */
    private String suit;

    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private int pointValue;

    /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank a <code>String</code> value containing the rank of the
     * card
     * @param cardSuit a <code>String</code> value containing the suit of the
     * card
     * @param cardPointValue an <code>int</code> value containing the point
     * value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        rank = cardRank.toLowerCase().trim();
        suit = cardSuit.toLowerCase().trim();
        pointValue = cardPointValue;
    }

    /**
     * Accesses this <code>Card's</code> suit.
     *
     * @return this <code>Card's</code> suit.
     */
    public String suit() {
        return this.suit;
    }

    /**
     * Accesses this <code>Card's</code> rank.
     *
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
        return this.rank;
    }

    /**
     * Accesses this <code>Card's</code> point value.
     *
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
        return this.pointValue;
    }

    /**
     * Converts an integer between 1 and 13 inclusive to it's respective
     * abbreviation
     *
     * @return the abbreviation corresponding a rank.
     */
    public static String intToRank(int ranknum) {
        switch (ranknum) {
            case 1:
                return "ace";
            case 10:
                return "10";
            case 11:
                return "jack";
            case 12:
                return "queen";
            case 13:
                return "king";
            default:
                return String.valueOf(ranknum).substring(0, 1);
        }
    }

    public static String intToSuit(int suitnum) {
        switch (suitnum) {
            case 1:
                return "spades";
            case 2:
                return "clubs";
            case 3:
                return "diamonds";
            case 4:
                return "hearts";
            default:
                return "Invalid suit specification " + suitnum;
        }
    }

    /**
     * Takes a suit name and returns the corresponding unicode equivalent
     *
     * @return the unicode character denoting a suit.
     */
    public static char unicodeChar(String suit) {
        suit = suit.toLowerCase().trim();
        switch (suit) {
            case "hearts":
                return '♥';
            case "diamonds":
                return '♦';
            case "clubs":
                return '♣';
            case "spades":
                return '♠';
            default:
                return suit.charAt(0);
        }
    }

    /**
     * Compare this card with the argument.
     *
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card are equal to
     * those of the argument; false otherwise.
     */
    public boolean matches(Card otherCard) {
        return suit.equals(otherCard.suit) && rank.equals(otherCard.rank) && pointValue == otherCard.pointValue;
    }

    public String conciseToString() {
        return intToRank(pointValue) + unicodeChar(suit);
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     * "[Rank] of [Suit] (point value = [PointValue])". This provides a useful
     * way of printing the contents of a <code>Deck</code> in an easily readable
     * format or performing other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit, and point value
     * of the card.
     */
    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
