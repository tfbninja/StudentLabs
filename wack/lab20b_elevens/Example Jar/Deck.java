
import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;
    private int size;

    public Deck(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt) {
        cards = new ArrayList();
        for (int i = 0; i < paramArrayOfString1.length; i++) {
            for (String str : paramArrayOfString2) {
                cards.add(new Card(paramArrayOfString1[i], str, paramArrayOfInt[i]));
            }
        }
        size = cards.size();
        shuffle();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void shuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = i + 1;
            int k = 0;
            int m = (int) (Math.random() * j) + k;
            Card localCard = (Card) cards.get(i);
            cards.set(i, cards.get(m));
            cards.set(m, localCard);
        }
        size = cards.size();
    }

    public Card deal() {
        if (isEmpty()) {
            return null;
        }
        size -= 1;
        Card localCard = (Card) cards.get(size);
        return localCard;
    }

    public String toString() {
        String str = "size = " + size + "\nUndealt cards: \n";

        for (int i = size - 1; i >= 0; i--) {
            str = str + cards.get(i);
            if (i != 0) {
                str = str + ", ";
            }
            if ((size - i) % 2 == 0) {
                str = str + "\n";
            }
        }

        str = str + "\nDealt cards: \n";
        for (i = cards.size() - 1; i >= size; i--) {
            str = str + cards.get(i);
            if (i != size) {
                str = str + ", ";
            }
            if ((i - cards.size()) % 2 == 0) {
                str = str + "\n";
            }
        }

        str = str + "\n";
        return str;
    }
}
