package lab20a_pong_project;

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

    public Physical() {
        x = 0;
        y = 0;
        z = 0;
        xVel = 0;
        yVel = 0;
        zVel = 0;
        weight = 0;
    }

    public Physical(int xPos, int yPos, int xVelocity, int yVelocity, int weight) {
        x = xPos;
        y = yPos;
        z = 0;
        xVel = xVelocity;
        yVel = yVelocity;
        zVel = 0;
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

    public int getXVelocity() {
        return xVel;
    }

    public int getYVelocity() {
        return yVel;
    }

    public int getZVelocity() {
        return zVel;
    }

    public int getWeight() {
        return weight;
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

    public void collision(Physical other) {
        int xMom = xVel * weight;
        int yMom = yVel * weight;
        int zMom = zVel * weight;
        int xMom2 = other.getXVelocity() * other.getWeight();
        int yMom2 = other.getYVelocity() * other.getWeight();
        int zMom2 = other.getZVelocity() * other.getWeight();
        
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
