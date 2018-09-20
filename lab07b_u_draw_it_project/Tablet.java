package lab07b_u_draw_it_project;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Tablet {

    private boolean[] keys;
    private int x;
    private int y;
    
    public Tablet() {
        keys = new boolean[5];
        x = GraphicsRunner.WIDTH / 2;
        y = GraphicsRunner.HEIGHT / 2;
    }

    public void paint(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.WHITE);
        graphics.setFont(new Font("TAHOMA", 18));
        graphics.strokeText("Draw a Shape", 20, 20);
        graphics.strokeText("Use the arrow keys to draw.", 20, 40);
        graphics.strokeText("Use the space bar to clear the screen.", 20, 60);

        //add in code to move the x and y
        //if the up arrow was pressed
        //take 1 away from y value
        //if the down arrow was pressed
        //add 1 to the y value
        //if the left array was pressed
        //take 1 away from x valye
        //if the right arrow was pressed
        //add 1 to the y value
        //if the space bar was pressed
        //reset x and y to the center
        //draw a black rectangle the size of the screen
        graphics.setFill(Color.WHITE);
        graphics.fillRect(x, y, 2, 2);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getCode() == KeyCode.LEFT) {
            keys[0] = true;
        }
        if (e.getCode() == KeyCode.RIGHT) {
            keys[1] = true;
        }
        if (e.getCode() == KeyCode.UP) {
            keys[2] = true;
        }
        if (e.getCode() == KeyCode.DOWN) {
            keys[3] = true;
        }
        if (e.getCode() == KeyCode.SPACE) {
            keys[4] = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getCode() == KeyCode.LEFT) {
            keys[0] = false;
        }
        if (e.getCode() == KeyCode.RIGHT) {
            keys[1] = false;
        }
        if (e.getCode() == KeyCode.UP) {
            keys[2] = false;
        }
        if (e.getCode() == KeyCode.DOWN) {
            keys[3] = false;
        }
        if (e.getCode() == KeyCode.SPACE) {
            keys[4] = false;
        }
    }
}
