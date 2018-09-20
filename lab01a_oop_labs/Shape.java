package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -

public class Shape {
    //instance variables

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    public Shape(int x, int y, int wid, int ht, Color col) {
        xPos = x;
        //finish this constructor
    }

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(color);
        graphics.fillRect(xPos, yPos, width, height);

        //draw whatever you want
        //    ^
        //  [ :: ]
        //    ()

    }

    //BONUS
    //add in set and get methods for all instance variables
    public String toString() {
        return xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
}