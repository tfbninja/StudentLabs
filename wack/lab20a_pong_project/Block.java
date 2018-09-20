package pong;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;




public class Block implements Renderable {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    //add a default and initialization Block constructor - x , y , width, height, color


    
    
    //add the get and set methods

    @Override
    public void draw(Canvas canvas, Color col) {
        //uncomment after you write the set and get methods
        //GraphicsContext graphics = canvas.getGraphicsContext2D();
        //graphics.setFill(col);
        //graphics.fillRect(getX(), getY(), getWidth(), getHeight()); 
    }

    public boolean equals(Object obj) {
		//complete this method
        return false;
    }

    //add a toString() method  - x , y , width, height, color

}