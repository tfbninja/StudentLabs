package lab05b_move_a_shape_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author Tim Barber
 */
public class ShapeBuildercopy {

    private double xPos;
    private double yPos;
    private double size;

    public ShapeBuildercopy(double x, double y, double sz) {
        xPos = x;
        yPos = y;
        size = sz;

    }

    public void show(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        double v = size / (2 + Math.sqrt(2.0));
        double sideLen = v * Math.sqrt(2.0);
        //X-Coordinates for stop sign, starting at the topmost point on the left line
        double[] xCoords1 = new double[]{xPos, xPos + v, xPos + v + sideLen, xPos + v + sideLen + v, xPos + v + sideLen + v, xPos + v + sideLen, xPos + v, xPos};
        //Y-Coordinates for stop sign, starting at the same place
        double[] yCoords2 = new double[]{yPos + v, yPos, yPos, yPos + v, yPos + v + sideLen, yPos + v + sideLen + v, yPos + v + sideLen + v, yPos + v + sideLen};
        graphics.setFill(Color.RED);
        graphics.setStroke(Color.RED);
        graphics.setLineWidth(4);
        graphics.fillPolygon(xCoords1, yCoords2, 8); //draw bordering red octagon
        graphics.setFont(new Font("IMPACT", (int)(0.16*size)));
        graphics.setFill(Color.WHITE);        
        graphics.fillText("STOP killing\nFrench people\nto make\nfrench fries", xPos+v/1.5, yPos+v/1.15, sideLen+v);

    }
}

/*
 * The MIT License
 *
 * Copyright 2018 Tim Barber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
