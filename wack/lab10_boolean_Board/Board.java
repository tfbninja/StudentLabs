package lab10_boolean_Board.sols;

// A+ Computer Science  -  www.apluscompsci.com
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

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
        width = 200;
        height = 200;
        canvas = new Canvas(width, height);
        topLeft = new Block(0, 0, width / 2 - 10, height / 2 - 10, Color.RED);
        topRight = new Block(width / 2, 0, width / 2 - 10, height / 2 - 10, Color.GREEN);
        botLeft = new Block(0, height / 2, width / 2 - 10, height / 2 - 10, Color.BLUE);
        botRight = new Block(width / 2, height / 2, width / 2 - 10, height / 2 - 10, Color.YELLOW);

    }
    //initialization constructor
    

    public void drawBlocks() {
        topLeft.draw(canvas);
        topRight.draw(canvas);
        botLeft.draw(canvas);
        botRight.draw(canvas);
    }

    public void swapTopRowColors() {
        Color temp = topLeft.getColor();

    }

    public void swapBottomRowColors() {

    }

    public void swapLeftColumnColors() {

    }

    public void swapRightColumnColors() {

    }

    public void mouseClicked(MouseEvent e) {
        double mouseX = e.getX();
        double mouseY = e.getY();
        if (e.getButton().equals(MouseButton.PRIMARY)) //left mouse button pressed
        {
           
        } 
		//right mouse button pressed
    }

    public String toString() {
        return " ";
    }

    public Canvas getCanvas() {
        return canvas;
    }
    
}
