package lab23f_recursion_garbage;

import lab10_boolean_Board.Locatable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public abstract class Cell implements Locatable {

    private int xPos;
    private int yPos;
    private int width;
    private int height;

    public Cell() {
        setPos(5, 5);
        setWidth(5);
        setHeight(5);
    }

    public Cell(int x, int y) {
        xPos = x;
        yPos = y;
        setWidth(5);
        setHeight(5);
    }

    public Cell(int x, int y, int w, int h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }

    public void setPos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void setX(int x) {
        xPos = x;
    }

    public void setY(int y) {
        yPos = y;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract void draw(Graphics window);

    public String toString() {
        return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
    }
}
