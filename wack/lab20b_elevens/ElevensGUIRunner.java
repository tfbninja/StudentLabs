package lab20b_elevens;

public class ElevensGUIRunner {

    /**
     * Plays the GUI version of Elevens.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        ElevensBoard board = new ElevensBoard();
        while (!board.anotherPlayIsPossible()) {
            board = new ElevensBoard();
        }
        CardGameGUI gui = new CardGameGUI(board);
        gui.displayGame();
    }
}
