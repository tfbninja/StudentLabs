/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Gasket {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        gasket(canvas, (canvas.getWidth() - 10) / 2, 20, canvas.getWidth() - 40, canvas.getHeight() - 20, 40, canvas.getHeight() - 20);

    }

    public void gasket(Canvas canvas, double x1, double y1, double x2, double y2, double x3, double y3) {
        //base case goes here
        //make a random color here
        //draw lines to make a triangle or use fillPolygon
        //make some recursive calls

    }
}
