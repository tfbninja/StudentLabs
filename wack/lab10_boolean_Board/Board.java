package lab10_boolean_Board;

// A+ Computer Science  -  www.apluscompsci.com
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

//Name -
//Date -
//Lab  - Board 
public class Board {
    //instance variables

    private int width;
    private int height;
    private Block topLeft;
    private Block topRight;
    private Block botLeft;
    private Block botRight;

    private Canvas canvas;

    public Board() //constructor
    {
        width = 600;
        height = 600;
        canvas = new Canvas(width, height);
        topLeft = new Block(10, 10, width / 2 - 10, height / 2 - 10, Color.RED);
        topRight = new Block(width / 2 + 10, 10, width / 2 - 10, height / 2 - 10, Color.GREEN);
        botLeft = new Block(10, height / 2 + 10, width / 2 - 10, height / 2 - 10, Color.BLUE);
        botRight = new Block(width / 2 + 10, height / 2 + 10, width / 2 - 10, height / 2 - 10, Color.YELLOW);

    }
    //initialization constructor

    public void drawBlocks() {

        topLeft.draw(canvas);
        topRight.draw(canvas);
        botLeft.draw(canvas);
        botRight.draw(canvas);
        System.out.println(topLeft.getColor());
    }

    public boolean isColor(Block block, Color color) {
        if (block.getColor() == color) {
            return true;
        }
        return false;
    }

    public Block getTopLeft() {
        return this.topLeft;
    }

    public Block getTopRight() {
        return this.topRight;
    }

    public Block getBotLeft() {
        return this.botLeft;
    }

    public Block getBotRight() {
        return this.botRight;
    }

    public void swapTopRowColors() {
        Color temp = topLeft.getColor();
        this.topLeft.setColor(this.topRight.getColor());
        this.topRight.setColor(temp);

    }

    public void swapBottomRowColors() {
        Color temp = botLeft.getColor();
        this.botLeft.setColor(this.botRight.getColor());
        this.botRight.setColor(temp);
    }

    public void swapLeftColumnColors() {
        Color temp = topLeft.getColor();
        this.topLeft.setColor(this.botLeft.getColor());
        this.botLeft.setColor(temp);
    }

    public void swapRightColumnColors() {
        Color temp = topRight.getColor();
        this.topRight.setColor(this.botRight.getColor());
        this.botRight.setColor(temp);
    }

    public void mouseClicked(MouseEvent e) {
        double mouseX = e.getX();
        double mouseY = e.getY();
        System.out.println("X: " + mouseX);
        System.out.println("Y: " + mouseY);
        if (e.getButton().equals(MouseButton.PRIMARY)) //left mouse button pressed
        {
            if (mouseX > this.topLeft.getX() && mouseX < (this.topRight.getX() + this.topLeft.getWidth())) { // within x bounds
                if (mouseY > this.topLeft.getY() && mouseY < this.topLeft.getY() + this.topLeft.getHeight()) { // within y bounds
                    if (mouseX > this.topRight.getX() || mouseX < this.topLeft.getX() + this.topLeft.getWidth()) { // not in margin
                        this.swapTopRowColors();
                        drawBlocks();

                    }

                } else {
                    if (mouseY > this.botLeft.getY() && mouseY < this.botLeft.getY() + this.botLeft.getHeight()) { // within y bounds
                        if (mouseX > this.botRight.getX() || mouseX < this.botLeft.getX() + this.botLeft.getWidth()) { // not in margin
                            this.swapBottomRowColors();
                            drawBlocks();

                        }

                    }
                }
            }
        } else if (e.getButton().equals(MouseButton.SECONDARY)) {
            if (mouseX > this.topLeft.getX() && mouseX < this.topLeft.getX() + this.topLeft.getWidth()) { // within x bounds
                if (mouseY > this.topLeft.getY() && mouseY < this.botRight.getY() + this.botLeft.getHeight()) { // within y bounds
                    if (mouseY < this.topLeft.getY() + this.topLeft.getHeight() || mouseY > this.botRight.getY()) { // not in margin
                        this.swapLeftColumnColors();
                        drawBlocks();
                    }
                }
            } else if (mouseX > this.topRight.getX() && mouseX < this.topRight.getX() + this.topLeft.getWidth()) { // within x bounds
                if (mouseY > this.topRight.getY() && mouseY < this.botRight.getY() + this.botRight.getHeight()) { // within y bounds
                    if (mouseY < this.topRight.getY() + this.topRight.getHeight() || mouseY > this.botRight.getY()) { // not in margin
                        this.swapRightColumnColors();
                        drawBlocks();
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "top left: [" + topLeft + "], top right: [" + topRight + "], bottom left: [" + botLeft + "], bottom right:[" + botRight + "]";
    }

    public Canvas getCanvas() {
        return canvas;
    }

}
