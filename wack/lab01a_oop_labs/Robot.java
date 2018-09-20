package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -


class Robot {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUE);

        graphics.strokeText("Robot LAB ", 35, 35);

        //call head method

        //call other methods

    }

    private void head(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.YELLOW);

        graphics.fillOval(300, 100, 200, 100);


        //add more code here

    }

    private void upperBody(Canvas canvas) {
        //add more code here
    }

    private void lowerBody(Canvas canvas) {
        //add more code here
    }
}