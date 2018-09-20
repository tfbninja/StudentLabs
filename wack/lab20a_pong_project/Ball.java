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
public class Ball extends Block implements Renderable, Updateable {

    private int xSpeed;
    private int ySpeed;

    public Ball() {
        super();
        xSpeed = 3;
        ySpeed = 1;
    }

    

    //add the other Ball constructors - see BallTestOne
    //add the set methods
    //add the get methods
    //add a toString() method
    @Override
    public void update(Canvas canvas) {
        //draw a white ball at old ball location
        draw(canvas, Color.WHITE);
		//update the ball location


    }

    @Override
    public boolean equals(Object obj) {
        //complete this method

        return false;
    }

    public void checkCollideLeft(Block b) {
	//complete this method - the word document might be helpful

    }
    public void checkCollideRight(Block b) { 
	//complete this method - the word document might be helpful

    }


}
