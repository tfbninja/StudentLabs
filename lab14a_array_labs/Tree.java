/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

/**
 *
 * @author wkranz
 */
public class Tree {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        System.out.println("hi");
        graphics.setStroke(Color.BLUE);
        graphics.strokeText("Lab14h - Tree Lab ", 50, 50);
        graphics.setFill(Color.GREEN);
        double[] treeXPoints = {400, 200, 600};
        double[] treeYPoints = {100, 500, 500};
        graphics.fillPolygon(treeXPoints, treeYPoints, 3);
    }
}
