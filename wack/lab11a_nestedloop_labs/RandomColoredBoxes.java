package lab11a_nestedloop_labs;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author wkranz
 */
public class RandomColoredBoxes {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.BLACK);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        graphics.setStroke(Color.RED);
        graphics.setFont(new Font("Tahoma", 16));
        graphics.strokeText("Drawing boxes with nested loops", 20, 40);
        //graphics.setFill(Color.BLUE);
		//nested for loop draw boxes across and down the screen.  canvas.getHeight() and canvas.getWidth() are helpful
		//make sure to use a random color.  Color.rgb could be helpful
        
    }

    public void clear(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
