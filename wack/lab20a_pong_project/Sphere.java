package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Tim Barber
 */
public class Sphere extends Physical {

    private int radius;

    public Sphere() {
        super();
        radius = 0;
    }

    public Sphere(int xPos, int yPos, int zPos, int xVelocity, int yVelocity, int zVelocity, int weight, int radius) {
        super(xPos, yPos, zPos, xVelocity, yVelocity, zVelocity, weight);
        this.radius = radius;
    }

    public void setRadius(int amt) {
        radius = amt;
    }

    public int getRadius() {
        return radius;
    }

    public void bounceBounds() {
        int x = super.getX(), y = super.getY(), z = super.getZ(), xV = super.getXVelocity(), yV = super.getYVelocity(), zV = super.getZVelocity(), r = radius;
        // left X, right X, top Y, bottom Y, back Z, front Z
        int lX = super.getLeftBound(), rX = super.getRightBound(), tY = super.getTopBound(), bY = super.getBottomBound(), bZ = super.getBackBound(), fZ = super.getFrontBound();
        // next Right (edge), next Left, next Top, next Bottom, next Back (Z space), next Front (also Z space)
        int nR = x + r, nL = x - r, nT = y - r, nB = y + r, nBZ = z - r, nFZ = z + r;
        // if edges are past bounds, inv(ert) their velocities
        if (x >= rX || nL <= lX) {
            super.invXVelocity();
        }
        if (nT <= tY || nB >= bY) {
            super.invYVelocity();
        }
        if (nBZ <= bZ || nFZ >= fZ) {
            super.invZVelocity();
        }
    }

    public int getMomentum() {
        return super.getWeight() * (Math.abs(super.getXVelocity()) + Math.abs(super.getYVelocity()) + Math.abs(super.getZVelocity()));
    }

    public void draw2D(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(super.getColor());
        gc.setStroke(super.getStroke());
        gc.strokeOval(super.getX(), super.getY(), radius, radius);
    }

    public void handlePotentialCollision(Sphere other) {
        int[] selfPos = super.getPos();
        int[] otherPos = other.getPos();
        //int[] selfPos = super.getNextTheoreticalPosition();
        //int[] otherPos = other.getNextTheoreticalPosition();
        int otherR = other.getRadius();

        int centerDist = (int) Math.sqrt(Math.pow(selfPos[0] - otherPos[0], 2) + Math.pow(selfPos[1] - otherPos[1], 2) + Math.pow(selfPos[2] - otherPos[2], 2));

        if (centerDist < otherR + radius) {
            collision(other);
        }
    }
}


/*
 * The MIT License
 *
 * Copyright (c) 2019 Tim Barber.
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
