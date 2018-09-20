package lab14c_array_moving_shapes_projects;

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
    private int xSpeed;
    private int ySpeed;

    /*
     *The constructor is used to initialize all instance variables.
     *The constructor makes the object.
     */
    public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
        xPos = x;
        //finish this constructor
    }

    /*
     *The draw method draws the shape on the screen.
     */
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(color);
        graphics.fillRect(xPos, yPos, width, height);

        //draw whatever you want
        //    ^
        //  [ :: ]
        //    ()

    }
    
    public void move() {
//        move the shape
    }

    //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
    public int getX() {
        return 0;
    }

    public void setX(int x) {
        //add code here
    }

    public String toString() {
        return xPos + " " + yPos + " " + width + " " + height + " " + color + " " + xSpeed + " " + ySpeed;
    }
}