package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -


public class SmileyFace {

    public void paint(Canvas canvas) {
        smileyFace(canvas);
    }

    public void smileyFace(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUE);
        graphics.strokeText("SMILEY FACE LAB ", 35, 35);

        graphics.setFill(Color.YELLOW);
        graphics.fillOval(210, 100, 400, 400);

        //add more code here


    }
}