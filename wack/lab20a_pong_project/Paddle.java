/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Paddle extends Block implements Renderable, Updateable {

    private int speed;
    private String direction;

    public Paddle() {
        super(10, 10, 10, 40, Color.BLACK);
        speed = 5;
        direction = "NEUTRAL	";
    }

    //add the other Paddle constructors
    //add get methods
    //add set methods
    //add a toString() method
    @Override
    public void update(Canvas canvas) {
        draw(canvas, Color.WHITE);
        if (direction.equals("UP")) {
            //update paddle
        } else if (direction.equals("DOWN")) {
            //update paddle
        }
    }



}
