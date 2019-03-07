package lab23h_recursion_fractal;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Tim Barber
 */
public class Gasket {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        int offset = -600;
        double w = canvas.getWidth() - offset;
        double h = canvas.getHeight() * 1.3;
        double n = 135;
        double x3 = Math.sqrt(3) * n;
        graphics.fillText("Color: hsb(sin(y1 / x1) * 360, 1, 1)", w / 2, h / 15);
        rainbowGasket(canvas, w / 2 - n, h / 2 - (x3 / 2), w / 2 + n, h / 2 - (x3 / 2), w / 2, h / 2 + x3 / 2);
        w = canvas.getWidth() + offset;
        graphics.fillText("Color: rgb(rand, rand, rand, 1)", w / 2, h / 15);
        gasket(canvas, w / 2 - n, h / 2 - (x3 / 2), w / 2 + n, h / 2 - (x3 / 2), w / 2, h / 2 + x3 / 2);
        //fractal(canvas, w / 2, h * 0.1, 175);
    }

    public boolean within(double v1, double v2, double withinDist) {
        return Math.abs(v2 - v1) < withinDist;
    }

    public void gasket(Canvas canvas, double x1, double y1, double x2, double y2, double x3, double y3) {
        if (within(x1, x2, 2.15)) {
            return;
        }
        Color random = new Color(Math.random(), Math.random(), Math.random(), 1.0);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(0.75);
        gc.setStroke(random);
        double[] xList = {x1, x2, x3};
        double[] yList = {y1, y2, y3};
        gc.strokePolygon(xList, yList, 3);
        double s = Math.abs(x2 - x1); // side length
        double qs = s / 4.0; // quarter-side length
        double h = Math.sqrt(3) * s / 2.0;// height
        gasket(canvas, x1 + qs, y1 - h / 2, x2 - qs, y2 - h / 2, x3, y3 - h); // top
        gasket(canvas, x1 - qs, y1 + h / 2, x2 - qs * 3, y2 + h / 2, x3 - qs * 2, y3); // left
        gasket(canvas, x1 + qs * 3, y1 + h / 2, x2 + qs, y2 + h / 2, x3 + qs * 2, y3); // right
    }

    public void rainbowGasket(Canvas canvas, double x1, double y1, double x2, double y2, double x3, double y3) {
        if (within(x1, x2, 2.15)) {
            return;
        }
        double dist = Math.sin(y1 / x1) * Math.PI * 2;
        System.out.println(Math.toDegrees(dist));
        Color c = Color.hsb(Math.toDegrees(dist), 1, 1);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(0.75);
        gc.setStroke(c);
        double[] xList = {x1, x2, x3};
        double[] yList = {y1, y2, y3};
        gc.strokePolygon(xList, yList, 3);
        double s = Math.abs(x2 - x1); // side length
        double qs = s / 4.0; // quarter-side length
        double h = Math.sqrt(3) * s / 2.0;// height
        rainbowGasket(canvas, x1 + qs, y1 - h / 2, x2 - qs, y2 - h / 2, x3, y3 - h); // top
        rainbowGasket(canvas, x1 - qs, y1 + h / 2, x2 - qs * 3, y2 + h / 2, x3 - qs * 2, y3); // left
        rainbowGasket(canvas, x1 + qs * 3, y1 + h / 2, x2 + qs, y2 + h / 2, x3 + qs * 2, y3); // right
    }

    public void fractal(Canvas canvas, double x1, double y1, double radius) {
        double multiplier = 0.7;
        if (radius < 2.1) {
            return;
        }
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Color c = Color.hsb(Math.toDegrees(Math.pow(Math.cos(radius) * Math.PI * y1, x1 / y1)), 1, 1);
        gc.setStroke(c);
        gc.strokeLine(x1, y1, x1 - radius, y1 + radius);
        gc.strokeLine(x1, y1, x1 + radius, y1 + radius);
        fractal(canvas, x1 - radius, y1 + radius, radius * multiplier);
        fractal(canvas, x1 + radius, y1 + radius, radius * multiplier);
    }
}
