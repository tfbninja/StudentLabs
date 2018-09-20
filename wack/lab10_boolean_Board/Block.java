package lab10_boolean_Board.sols;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Lab  - Block

public class Block implements Locatable {
    //instance variables

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    //constructors
    //set methods

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(color);
        graphics.fillRect(getX(), getY(), getWidth(), getHeight());
    }
    //get methods
    //toString
   
    }
}