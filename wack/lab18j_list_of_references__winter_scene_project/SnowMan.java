package lab18j_list_of_references__winter_scene_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SnowMan extends AbstractShape {

    private int x;
    private int y;
    private int w;
    private int h;
    private Color color;
    private int xSpeed;
    private int ySpeed;

    public SnowMan(int x, int y, int w, int h) {
        super(x, y, w, h, Color.WHITE, 0, 0);
    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.fillOval(x - w / 2, y - h / 2, w, h);
    }

}
