package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Block implements Renderable {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    private boolean xBounds = false;
    private boolean yBounds = false;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public Block() {
        xPos = 100;
        yPos = 100;
        width = 10;
        height = 10;
        color = Color.BLACK;
    }

    public Block(int xPos, int yPos, int width, int height, Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void changeX(int byHowMuch) {
        xPos += byHowMuch;
    }

    public void changeY(int byHowMuch) {
        yPos += byHowMuch;
    }

    public void changeX(double byHowMuch) {
        xPos += byHowMuch;
    }

    public void changeY(double byHowMuch) {
        yPos += byHowMuch;
    }

    public void setBounds(int leftX, int topY, int rightX, int bottomY) {
        this.xBounds = true;
        this.yBounds = true;
        this.minX = leftX;
        this.maxX = rightX;
        this.minY = topY;
        this.maxY = bottomY;
    }

    public void setYBounds(int topY, int bottomY) {
        this.yBounds = true;
        this.minY = topY;
        this.maxY = bottomY;
    }

    public void setXBounds(int leftX, int rightX) {
        this.xBounds = true;
        this.minX = leftX;
        this.maxX = rightX;
    }

    public void turnOffBounds() {
        xBounds = false;
        yBounds = false;
    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public void turnOnBounds() {
        xBounds = true;
        yBounds = true;
    }

    public void setXBoundsOn(boolean val) {
        xBounds = val;
    }

    public void setYBoundsOn(boolean val) {
        yBounds = val;
    }

    public boolean getXBoundsOn() {
        return xBounds;
    }

    public boolean getYBoundsOn() {
        return yBounds;
    }

    public int[] getBounds() {
        int[] tempBounds = {minX, minY, maxX, maxY};
        return tempBounds;
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

    public Color getColor() {
        return color;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Canvas canvas, Color col) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(col);
        graphics.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public boolean equals(Block obj) {
        if (xPos == obj.xPos && yPos == obj.yPos && width == obj.width && height == obj.height && color == obj.color) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "" + xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
}
