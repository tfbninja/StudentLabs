
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class MouseButtonTester {

    private Canvas canvas;

    public MouseButtonTester() {
        canvas = new Canvas(800, 600);

    }
    public void paintLeft(double x, double y) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
		//draw a rectangle at the current x,y location
    }
    public void paintRight(double x, double y) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
		//draw a circle at the current x,y location
		}
    
    public Canvas getCanvas() {
        return canvas;
    }
}
