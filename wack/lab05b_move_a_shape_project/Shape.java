package lab05b_move_a_shape_project;

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
    

    public void setX(int x) {
        //add code here
    }
    
    public int getX() {
        return 0;
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

    /*
     *This draw method will be used to erase the shape.
     */
    public void clear(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public void move() {
        xPos = xPos + xSpeed;
        yPos = yPos + ySpeed;
    }
    
    //add in set and get methods for xPos, yPos, xSpeed, and ySpeed

    public String toString() {
        return xPos + " " + yPos + " " + width + " " + height + " " + color + " " + xSpeed + " " + ySpeed;
    }
}