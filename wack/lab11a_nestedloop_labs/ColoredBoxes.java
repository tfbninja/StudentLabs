package lab11a_nestedloop_labs;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author Tim Barber
 */
public class ColoredBoxes {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.RED);
        graphics.setFont(new Font("Tahoma", 16));
        graphics.fillText("Drawing boxes with nested loops", 20, 40);
        graphics.setFill(Color.BLUE);

        int startX = 40;
        int startY = 50;
        int margin = 5;
        int size = 15;

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                graphics.fillRect(startX + (column * (margin + size)), startY + (row * (margin + size)), size, size);
            }
        }

    }

}
