package lab23a_recursion_circles;

import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author wkranz
 */
public class RecursiveCircles {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.BLUE);
        graphics.strokeText("Lab21a", 20, 40);

        graphics.strokeText("Drawing Circles Using Recursion ", 20, 80);
        drawCircles(canvas, 10, 10);
    }

    public void drawCircles(Canvas canvas, int x, int y) {
        //base case
        if (x < 100) {
            GraphicsContext graphics = canvas.getGraphicsContext2D();
            graphics.setStroke(Color.BLUE);

            graphics.strokeOval(90 + x, 90 + y, 20 + x, 20 + x);

            drawCircles(canvas, x + 10, y + 10);
        }
    }
}
