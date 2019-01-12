package lab20a_pong_project;

import javafx.scene.paint.Color;

/**
 *
 * @author Tim Barber
 */
public class Physical {

    private int x;
    private int y;
    private int z;
    private int xVel;
    private int yVel;
    private int zVel;
    private int weight;
    private Color color = Color.SILVER;
    private Color stroke = Color.BLACK;
    // bounds
    private int bottomY;
    private int topY;
    private int leftX;
    private int rightX;
    private int backZ;
    private int frontZ;

    public Physical() {
        x = 0;
        y = 0;
        z = 0;
        xVel = 0;
        yVel = 0;
        zVel = 0;
        weight = 0;
    }

    public Physical(int xPos, int yPos, int zPos, int xVelocity, int yVelocity, int zVelocity, int weight) {
        x = xPos;
        y = yPos;
        z = zPos;
        xVel = xVelocity;
        yVel = yVelocity;
        zVel = zVelocity;
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int[] getPos() {
        int[] pos = {x, y, z};
        return pos;
    }

    public int getXVelocity() {
        return xVel;
    }

    public int getYVelocity() {
        return yVel;
    }

    public int getZVelocity() {
        return zVel;
    }

    public int[] getVelocity() {
        int[] velocity = {xVel, yVel, zVel};
        return velocity;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return this.color;
    }

    public Color getStroke() {
        return this.stroke;
    }

    public int getLeftBound() {
        return leftX;
    }

    public int getRightBound() {
        return rightX;
    }

    public int getTopBound() {
        return topY;
    }

    public int getBottomBound() {
        return bottomY;
    }

    public int getBackBound() {
        return backZ;
    }

    public int getFrontBound() {
        return frontZ;
    }

    public int[] getBounds() {
        int[] bounds = {getLeftBound(), getRightBound(), getTopBound(), getBottomBound(), getBackBound(), getFrontBound()};
        return bounds;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXVelocity(int amt) {
        this.xVel = amt;
    }

    public void setYVelocity(int amt) {
        this.yVel = amt;
    }

    public void setZVelocity(int amt) {
        this.zVel = amt;
    }

    public void setWeight(int amt) {
        this.weight = amt;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStroke(Color stroke) {
        this.stroke = stroke;
    }

    public void setLeftBound(int amt) {
        leftX = amt;
    }

    public void setRightBound(int amt) {
        rightX = amt;
    }

    public void setTopBound(int amt) {
        topY = amt;
    }

    public void setBottomBound(int amt) {
        bottomY = amt;
    }

    public void setBackBound(int amt) {
        backZ = amt;
    }

    public void setFrontBound(int amt) {
        frontZ = amt;
    }

    public void setBounds(int[] bounds) {
        setLeftBound(bounds[0]);
        setRightBound(bounds[1]);
        setTopBound(bounds[2]);
        setBottomBound(bounds[3]);
        setBackBound(bounds[4]);
        setFrontBound(bounds[5]);
    }

    public void invXVelocity() {
        xVel = -xVel;
    }

    public void invYVelocity() {
        yVel = -yVel;
    }

    public void invZVelocity() {
        zVel = -zVel;
    }

    public void updatePosition() {
        setX(getX() + getXVelocity());
        setY(getY() + getYVelocity());
        setZ(getZ() + getZVelocity());
    }

    /*
     * @return next x, y, and z coordinates assuming no collision
     */
    public int[] getNextTheoreticalPosition() {
        int[] nextPos = new int[3];
        nextPos[0] = x + xVel;
        nextPos[1] = y + yVel;
        nextPos[2] = z + zVel;
        return nextPos;
    }

    public int abs(int num){
        return Math.abs(num);
    }

    public double abs(double num){
        return Math.abs(num);
    }

    public void collision(Physical other) {
        int xMom = xVel * weight;
        int yMom = yVel * weight;
        int zMom = zVel * weight;
        int xMom2 = other.getXVelocity() * other.getWeight();
        int yMom2 = other.getYVelocity() * other.getWeight();
        int zMom2 = other.getZVelocity() * other.getWeight();

        // based off this: http://www.ww-p.org/common/pages/DisplayFile.aspx?itemId=8889217
        int centerMassX = (xMom + xMom2) / (weight + other.getWeight());
        int centerMassY = (yMom + yMom2) / (weight + other.getWeight());
        int centerMassZ = (zMom + zMom2) / (weight + other.getWeight());

        xVel = -xVel + 3 * centerMassX;
        yVel = -yVel + 3 * centerMassY;
        zVel = -zVel + 3 * centerMassZ;
        other.setXVelocity(-other.getXVelocity() + 2 * centerMassX);
        other.setYVelocity(-other.getYVelocity() + 2 * centerMassY);
        other.setZVelocity(-other.getZVelocity() + 2 * centerMassZ);
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
