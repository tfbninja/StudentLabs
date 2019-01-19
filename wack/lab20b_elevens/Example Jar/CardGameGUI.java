
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class CardGameGUI
        extends JFrame
        implements ActionListener {

    private static final int DEFAULT_HEIGHT = 302;
    private static final int DEFAULT_WIDTH = 800;
    private static final int CARD_WIDTH = 73;
    private static final int CARD_HEIGHT = 97;
    private static final int LAYOUT_TOP = 30;
    private static final int LAYOUT_LEFT = 30;
    private static final int LAYOUT_WIDTH_INC = 100;
    private static final int LAYOUT_HEIGHT_INC = 125;
    private static final int BUTTON_TOP = 30;
    private static final int BUTTON_LEFT = 570;
    private static final int BUTTON_HEIGHT_INC = 50;
    private static final int LABEL_TOP = 160;
    private static final int LABEL_LEFT = 540;
    private static final int LABEL_HEIGHT_INC = 35;
    private Board board;
    private JPanel panel;
    private JButton replaceButton;
    private JButton restartButton;
    private JLabel statusMsg;
    private JLabel totalsMsg;
    private JLabel[] displayCards;
    private JLabel winMsg;
    private JLabel lossMsg;
    private Point[] cardCoords;
    private boolean[] selections;
    private int totalWins;
    private int totalGames;

    public CardGameGUI(Board paramBoard) {
        board = paramBoard;
        totalWins = 0;
        totalGames = 0;

        cardCoords = new Point[board.size()];
        int i = 30;
        int j = 30;
        for (int k = 0; k < cardCoords.length; k++) {
            cardCoords[k] = new Point(i, j);
            if (k % 5 == 4) {
                i = 30;
                j += 125;
            } else {
                i += 100;
            }
        }

        selections = new boolean[board.size()];
        initDisplay();
        setDefaultCloseOperation(3);
        repaint();
    }

    public void displayGame() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }

    public void repaint() {
        for (int i = 0; i < board.size(); i++) {
            String str = imageFileName(board.cardAt(i), selections[i]);

            URL localURL = getClass().getResource(str);
            if (localURL != null) {
                ImageIcon localImageIcon = new ImageIcon(localURL);
                displayCards[i].setIcon(localImageIcon);
                displayCards[i].setVisible(true);
            } else {
                throw new RuntimeException("Card image not found: \"" + str + "\"");
            }
        }

        statusMsg.setText(board.deckSize() + " undealt cards remain.");

        statusMsg.setVisible(true);
        totalsMsg.setText("You've won " + totalWins + " out of " + totalGames + " games.");

        totalsMsg.setVisible(true);
        pack();
        panel.repaint();
    }

    private void initDisplay() {
        panel = new JPanel() {
            public void paintComponent(Graphics paramAnonymousGraphics) {
                super.paintComponent(paramAnonymousGraphics);

            }

        };
        String str1 = board.getClass().getSimpleName();
        int i = str1.length();
        int j = "Board".length();
        String str2 = str1.substring(i - j);
        if ((str2.equals("Board")) || (str2.equals("board"))) {
            k = i - j;
            setTitle(str1.substring(0, k));
        }

        int k = (board.size() + 4) / 5;
        int m = 302;
        if (k > 2) {
            m += (k - 2) * 125;
        }

        setSize(new Dimension(800, m));
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(780, m - 20));

        displayCards = new JLabel[board.size()];
        for (int n = 0; n < board.size(); n++) {
            displayCards[n] = new JLabel();
            panel.add(displayCards[n]);
            displayCards[n].setBounds(cardCoords[n].x, cardCoords[n].y, 73, 97);

            displayCards[n].addMouseListener(new CardGameGUI.MyMouseListener(null));
            selections[n] = false;
        }
        replaceButton = new JButton();
        replaceButton.setText("Replace");
        panel.add(replaceButton);
        replaceButton.setBounds(570, 30, 100, 30);
        replaceButton.addActionListener(this);

        restartButton = new JButton();
        restartButton.setText("Restart");
        panel.add(restartButton);
        restartButton.setBounds(570, 80, 100, 30);

        restartButton.addActionListener(this);

        statusMsg = new JLabel(board.deckSize() + " undealt cards remain.");

        panel.add(statusMsg);
        statusMsg.setBounds(540, 160, 250, 30);

        winMsg = new JLabel();
        winMsg.setBounds(540, 195, 200, 30);
        winMsg.setFont(new Font("SansSerif", 1, 25));
        winMsg.setForeground(Color.GREEN);
        winMsg.setText("You win!");
        panel.add(winMsg);
        winMsg.setVisible(false);

        lossMsg = new JLabel();
        lossMsg.setBounds(540, 195, 200, 30);
        lossMsg.setFont(new Font("SanSerif", 1, 25));
        lossMsg.setForeground(Color.RED);
        lossMsg.setText("Sorry, you lose.");
        panel.add(lossMsg);
        lossMsg.setVisible(false);

        totalsMsg = new JLabel("You've won " + totalWins + " out of " + totalGames + " games.");

        totalsMsg.setBounds(540, 230, 250, 30);

        panel.add(totalsMsg);

        if (!board.anotherPlayIsPossible()) {
            signalLoss();
        }

        pack();
        getContentPane().add(panel);
        getRootPane().setDefaultButton(replaceButton);
        panel.setVisible(true);
    }

    private void signalError() {
        Toolkit localToolkit = panel.getToolkit();
        localToolkit.beep();
    }

    private String imageFileName(Card paramCard, boolean paramBoolean) {
        String str = "cards/";
        if (paramCard == null) {
            return "cards/back1.GIF";
        }
        str = str + paramCard.rank() + paramCard.suit();
        if (paramBoolean) {
            str = str + "S";
        }
        str = str + ".GIF";
        return str;
    }

    public void actionPerformed(ActionEvent paramActionEvent) {
        if (paramActionEvent.getSource().equals(replaceButton)) {
            ArrayList localArrayList = new ArrayList();
            for (int j = 0; j < board.size(); j++) {
                if (selections[j] != 0) {
                    localArrayList.add(new Integer(j));
                }
            }

            if (!board.isLegal(localArrayList)) {
                signalError();
                return;
            }
            for (j = 0; j < board.size(); j++) {
                selections[j] = false;
            }

            board.replaceSelectedCards(localArrayList);
            if (board.isEmpty()) {
                signalWin();
            } else if (!board.anotherPlayIsPossible()) {
                signalLoss();
            }
            repaint();
        } else if (paramActionEvent.getSource().equals(restartButton)) {
            board.newGame();
            getRootPane().setDefaultButton(replaceButton);
            winMsg.setVisible(false);
            lossMsg.setVisible(false);
            if (!board.anotherPlayIsPossible()) {
                signalLoss();
                lossMsg.setVisible(true);
            }
            for (int i = 0; i < selections.length; i++) {
                selections[i] = false;
            }
            repaint();
        } else {
            signalError();
            return;
        }
    }

    private void signalWin() {
        getRootPane().setDefaultButton(restartButton);
        winMsg.setVisible(true);
        totalWins += 1;
        totalGames += 1;
    }

    private void signalLoss() {
        getRootPane().setDefaultButton(restartButton);
        lossMsg.setVisible(true);
        totalGames += 1;
    }

    private class MyMouseListener
            implements MouseListener {

        private MyMouseListener() {
        }

        public void mouseClicked(MouseEvent paramMouseEvent) {
            for (int i = 0; i < board.size(); i++) {
                if ((paramMouseEvent.getSource().equals(displayCards[i])) && (board.cardAt(i) != null)) {
                    selections[i] = (selections[i] == 0 ? 1 : 0);
                    repaint();
                    return;
                }
            }
            CardGameGUI.this.signalError();
        }

        public void mouseExited(MouseEvent paramMouseEvent) {
        }

        public void mouseReleased(MouseEvent paramMouseEvent) {
        }

        public void mouseEntered(MouseEvent paramMouseEvent) {
        }

        public void mousePressed(MouseEvent paramMouseEvent) {
        }
    }
}
