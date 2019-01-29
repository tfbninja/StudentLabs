package lab20b_elevens;

import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS
            = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS
            = {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES
            = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;

    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES, 11);
    }

    public boolean containsDuplicate(ArrayList<Integer> list, int index) {
        for (int i : list) {
            if (super.cardAt(i).pointValue() == super.cardAt(index).pointValue()) {
                return true;
            }
        }
        return false;
    }

    public int[] hint() {
        //ArrayList<Integer> converted = new ArrayList<>();
        ArrayList<Integer> validMove = new ArrayList<>();
        //for (int i : super.cardIndexes()) {
        //   converted.add(super.cardAt(i).pointValue());
        //}
        if (containsJQK(super.cardIndexes())) {
            for (int i : super.cardIndexes()) {
                if (super.cardAt(i).pointValue() >= 11 && super.cardAt(i).pointValue() <= 13 && validMove.size() < 3) {
                    if (!containsDuplicate(validMove, i)) {
                        validMove.add(i);
                    }
                }
            }
        } else if (containsPairSum(
                super.cardIndexes(), super.getSumTo())) {
            for (int i : super.cardIndexes()) {
                for (int j : super.cardIndexes()) {
                    if (super.cardAt(i).pointValue() + super.cardAt(j).pointValue() == super.getSumTo() && validMove.size() < 2) {
                        validMove.add(i);
                        validMove.add(j);
                    }
                }
            }
        }
        int[] validMoves = new int[validMove.size()];
        int index = 0;
        for (int i : validMove) {
            validMoves[index] = i;
            index++;
        }
        return validMoves;
    }

    /**
     * Determines if the selected cards form a valid group for removal. In
     * Elevens, the legal groups are (1) a pair of non-face cards whose values
     * add to 11, and (2) a group of three cards consisting of a jack, a queen,
     * and a king in some order.
     *
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal; false
     * otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) {
        //System.out.println("Selected cards " + selectedCards);
        //System.out.println("Contains pair sum: " + containsPairSum(selectedCards, super.getSumTo()));
        //System.out.println("Contains JQK " + containsJQK(selectedCards));
        return (containsJQK(selectedCards) && selectedCards.size() == 3) || (containsPairSum(selectedCards, super.getSumTo()) && selectedCards.size() == 2);
    }

    /**
     * Determine if there are any legal plays left on the board. In Elevens,
     * there is a legal play if the board contains (1) a pair of non-face cards
     * whose values add to 11, or (2) a group of three cards consisting of a
     * jack, a queen, and a king in some order.
     *
     * @return true if there is a legal play left on the board; false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        return containsPairSum(super.cardIndexes(), super.getSumTo()) || containsJQK(super.cardIndexes());
    }

    /**
     * Check for an 11-pair in the selected cards.
     *
     * @param selectedCards selects a subset of this board. It is list of
     * indexes into this board that are searched to find an 11-pair.
     * @return true if the board entries in selectedCards contain an 11-pair;
     * false otherwise.
     */
    private boolean containsPairSum(List<Integer> selectedCards, int sumGoal) {
        boolean answer = false;
        //ArrayList<Integer> converted = new ArrayList<>();
        //for (int i : selectedCards) {
        //   converted.add(super.cardAt(i).pointValue());
        //}

        outside:
        for (int i : selectedCards) {
            for (int j : selectedCards) {
                answer = answer || super.cardAt(i).pointValue() + super.cardAt(j).pointValue() == sumGoal;
                if (answer) {
                    break outside;
                }
            }
        }
        return answer;
    }

    /**
     * Check for a JQK in the selected cards.
     *
     * @param selectedCards selects a subset of this board. It is list of
     * indexes into this board that are searched to find a JQK group.
     * @return true if the board entries in selectedCards include a jack, a
     * queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        ArrayList<Integer> converted = new ArrayList<>();
        for (int i : selectedCards) {
            converted.add(super.cardAt(i).pointValue());
        }
        return converted.contains(11) && converted.contains(12) && converted.contains(13);
    }
}
