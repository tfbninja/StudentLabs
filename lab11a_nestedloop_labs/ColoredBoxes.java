package lab11a_nestedloop_labs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author wkranz
 */
public class ColoredBoxes {
    
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.RED);
        graphics.setFont(new Font("Tahoma",16));
        graphics.strokeText("Drawing boxes with nested loops", 20, 40);
		
		//nested loop to draw colored boxes
        
    }
    
}
