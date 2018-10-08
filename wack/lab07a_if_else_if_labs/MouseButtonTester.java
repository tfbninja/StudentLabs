
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class MouseButtonTester {

    private Canvas canvas;
    private int size = 10;

    public MouseButtonTester() {
        canvas = new Canvas(800, 600);

    }

    public void paintLeft(double x, double y) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.FIREBRICK);
        graphics.strokeRect(x, y, size, size);
        //draw a rectangle at the current x,y location
    }

    public void paintRight(double x, double y) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUEVIOLET);
        graphics.strokeOval(x, y, size, size);
        //draw a circle at the current x,y location
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
