package lab23f_recursion_garbage;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class GarbageCollector extends JPanel implements MouseListener {

    private int mouseX, mouseY;
    private boolean mouseClicked;
    private Grid trashMap;
    private int[][] used;
    private Grid bg;
    private final static int rows = 20;
    private final static int cols = 20;

    public GarbageCollector() {
        mouseClicked = false;
        formatUsed();
        trashMap = new Grid(rows, cols);
        bg = new Grid(rows, cols);
        for (int r = 0; r < trashMap.getNumRows(); r++) {
            for (int c = 0; c < trashMap.getNumCols(); c++) {
                bg.setSpot(r, c, new ColoredCell(r * rows + 10, c * cols + 10, 10, 10, false, Color.ORANGE));
                int num = (int) (Math.random() * 2);
                if (num == 1) {
                    trashMap.setSpot(r, c, new ColoredCell(r * rows + 12, c * cols + 1, 7, 7, false, Color.WHITE));
                } else {
                    trashMap.setSpot(r, c, new ColoredCell(r * rows + 11, c * cols + 11, 9, 9, true, Color.GREEN));
                }
            }
        }

        setBackground(Color.white);
        setVisible(true);

        addMouseListener(this);
    }

    public void formatUsed() {
        used = new int[rows][cols];
    }

    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        mouseClicked = true;
        repaint();
    }

    public void paintComponent(Graphics window) {
        super.paintComponent(window);
        window.setFont(new Font("TAHOMA", Font.BOLD, 12));
        window.setColor(Color.blue);
        window.drawString("Lab24c", 420, 40);
        window.drawString("THE GARBAGE COLLECTOR LAB", 420, 55);
        if (mouseClicked) {
            int c = mouseY / cols;
            int r = mouseX / rows;
            pickUpTrash(r, c);
            mouseClicked = false;
        }
        drawTrashMap(window);
    }

    public void drawTrashMap(Graphics window) {
        bg.drawGrid(window);
        trashMap.drawGrid(window);
    }

    public void pickUpTrash(int r, int c) {
        if (r < 0 || c < 0 || r > trashMap.getNumRows() - 1 || c > trashMap.getNumCols() - 1) {
            return;
        }
        if (used[r][c] == 1) {
            return;
        }
        Color self = trashMap.getSpot(r, c).getColor();
        if (self.equals(Color.GREEN)) {
            used[r][c] = 1;
            trashMap.getSpot(r, c).setColor(Color.BLUE);
            if (count(used) == 1) {
                pickUpTrash(r + 1, c);
                pickUpTrash(r, c + 1);
                pickUpTrash(r - 1, c);
                pickUpTrash(r, c - 1);
                formatUsed();
            } else {
                pickUpTrash(r + 1, c);
                pickUpTrash(r, c + 1);
                pickUpTrash(r - 1, c);
                pickUpTrash(r, c - 1);
            }
        }
    }

    public int count(int[][] list) {
        int counter = 0;
        for (int[] list1 : list) {
            for (int c = 0; c < list1.length; c++) {
                if (list1[c] != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public int dist(int x, int y, int x2, int y2) {
        return (int) Math.round(Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2)));
    }

    public void mousePressed(MouseEvent e) {
        int[] colX = new int[cols];
        int[] rowY = new int[rows];
        int index = 0;
        for (int i = 15; i < cols * 10; i += 10) {
            colX[index] = i;
            index++;
        }
        index = 0;
        for (int i = 15; i < rows * 10; i += 10) {
            rowY[index] = i;
            index++;
        }
        int[] xDists = new int[cols];
        int[] yDists = new int[rows];
        index = 0;
        for (int i : colX) {
            xDists[index] = dist(mouseX, mouseY, colX[index], 10);
            index++;
        }
        index = 0;
        for (int i : rowY) {
            yDists[index] = dist(mouseX, mouseY, 10, rowY[index]);
            index++;
        }
        int xVal = min(xDists);
        int yVal = min(yDists);
        if (xVal > 0 && yVal > 0 && xVal < rows && yVal < cols) {
            pickUpTrash(xVal, yVal);
        }
    }

    public int min(int[] list) {
        int pos = 0;
        int minimum = list[pos];
        int index = 0;
        for (int i : list) {
            if (i < minimum) {
                minimum = i;
                pos = index;
            }
            index++;
        }
        return pos;
    }

    public void mouseReleased(MouseEvent e) {
    }
}
