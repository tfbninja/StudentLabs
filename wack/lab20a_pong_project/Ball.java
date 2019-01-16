package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Ball extends Block implements Renderable, Updateable {

    private double xSpeed;
    private double ySpeed;
    private double startingSpeed = 0.0;
    private double speedIncrement = 0.0;

    private int xSwitches = 0;
    private int ySwitches = 0;

    private Block lP;
    private Block rP;

    public Ball() {
        super();
        super.setWidth(15);
        super.setHeight(15);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int xPos, int yPos, int width, int height, Color color, double startingSpeed, double speedIncrement) {
        super(xPos, yPos, width, height, color);
        this.startingSpeed = startingSpeed;
        this.speedIncrement = speedIncrement;
        ySpeed = randomDoubleInBoundsPercentAwayFromZero(-this.startingSpeed - this.speedIncrement, this.startingSpeed + this.speedIncrement, 0.5);
        xSpeed = randomDoubleInBounds(this.startingSpeed, this.startingSpeed + this.speedIncrement);
    }

    public void addPaddles(Block left, Block right) {
        this.lP = left;
        this.rP = right;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(double amt) {
        this.xSpeed = amt;
    }

    public void setYSpeed(double amt) {
        this.ySpeed = amt;
    }

    @Override
    public String toString() {
        return super.toString() + " " + xSpeed + " " + ySpeed;
    }

    public int pongBehavior() {
        boolean left = this.checkCollideLeft(this.getMinX());
        boolean right = this.checkCollideRight(this.getMaxX());
        if (left || right) {
            // if it hits the right/left walls, reset position to middle
            super.setXPos(super.getMaxX() / 2 - super.getWidth() / 2);
            super.setYPos(super.getMaxY() / 2 - super.getHeight() / 2);

            ySpeed = randomDoubleInBoundsPercentAwayFromZero(-this.startingSpeed - this.speedIncrement, this.startingSpeed + this.speedIncrement, 0.5);
            // set xVelocity to random amount heading towards winning player
            if (left) {
                // hit left wall, meaning head towards right wall
                xSpeed = randomDoubleInBounds(this.startingSpeed, this.startingSpeed + this.speedIncrement);
            } else {
                // hit right wall, meaning head towards left wall
                xSpeed = randomDoubleInBounds(-this.startingSpeed - this.speedIncrement, -this.startingSpeed);
            }
        }
        if (left) {
            return -1;
        } else if (right) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setBaseSpeed(double apprxmtBallStartingSpeed) {
        this.startingSpeed = apprxmtBallStartingSpeed;
    }

    public void setSpeedIncrement(double amt) {
        this.speedIncrement = amt;
    }

    public double randomDoubleInBounds(double lowBound, double highBound) {
        return Math.random() * (highBound - lowBound) + lowBound;
    }

    public double randomDoubleInBoundsPercentAwayFromZero(double lowBound, double highBound, double zeroPercent) {
        double num;
        do {
            num = Math.random() * (highBound - lowBound) + lowBound;
        } while (num < zeroPercent * highBound && num >= 0 || num > zeroPercent * lowBound && num <= 0);
        return num;
    }

    @Override
    public void update(Canvas canvas
    ) {
        super.changeX(xSpeed);
        super.changeY(ySpeed);

        int[] bounds = super.getBounds();
        if (super.getXBoundsOn()) {
            checkCollideLeft(bounds[0]);
            checkCollideRight(bounds[2]);
        }
        if (super.getYBoundsOn()) {
            checkCollideTop(bounds[1]);
            checkCollideTop(bounds[3]);
        }
        if (this.checkLeftPaddle(lP) || this.checkRightPaddle(rP)) {
            if (this.xSpeed > 0) {
                xSpeed += this.speedIncrement;
            } else {
                xSpeed -= this.speedIncrement;
            }
            if (this.ySpeed > 0) {
                ySpeed += speedIncrement;
            } else {
                ySpeed -= speedIncrement;
            }
        }

        draw(canvas, super.getColor());
    }

    public boolean equals(Ball obj) {
        if (super.equals(obj) && obj.xSpeed == xSpeed && obj.ySpeed == ySpeed) {
            return true;
        }
        return false;
    }

    public boolean inCollisionWith(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        if (x + w >= bX && x < bX + bW && y + h >= bY && y < bY + bH) {
            return true;
        }
        return false;
    }

    public boolean checkLeftPaddle(Block b) {
        //int bX = b.getX(), bW = b.getWidth(), x = super.getX(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        return checkCollideRightSide(b);
    }

    public boolean checkRightPaddle(Block b) {
        //int bX = b.getX(), bW = b.getWidth(), x = super.getX(), y = super.getY(), w = super.getWidth(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        return checkCollideLeftSide(b);
    }

    public boolean checkCollideLeftSide(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = b.getHeight();
        if (x + w >= bX && x < bX + 0.5 * bW) {
            if (y + h > bY && y < bY + bH) {
                xSpeed = -Math.abs(xSpeed);
                super.changeX(xSpeed);
                return true;
            }
        }
        return false;
    }

    public boolean checkCollideRightSide(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = b.getHeight();
        if (x <= bX + bW && x > bX + 0.5 * bW) {
            if (y + h > bY && y < bY + bH) {
                xSpeed = Math.abs(xSpeed);
                super.changeX(xSpeed);
                return true;
            }
        }
        return false;
    }

    public boolean checkCollideTop(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = b.getHeight();
        //x += xSpeed;
        //y += ySpeed;
        if (y <= bY + bH && y > bY) {
            if (x + w > bX && x < bX + bW) {
                ySpeed = -Math.abs(ySpeed);
                super.changeY(ySpeed);
                return true;
            }
        }
        return false;
    }

    public boolean checkCollideBottom(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = b.getHeight();
        //x += xSpeed;
        //y += ySpeed;
        if (y + h >= bY && y < bY + bH) {
            if (x + w > bX && x < bX + bW) {
                ySpeed = Math.abs(ySpeed);
                super.changeY(ySpeed);
                return true;
            }
        }
        return false;
    }

    public boolean checkCollideTop(int yLine) {
        int y = super.getY(), h = super.getHeight();
        y += ySpeed;
        if (y <= yLine && y + h > yLine) {
            ySpeed = -ySpeed;
            return true;
        }
        return false;
    }

    public boolean checkCollideBottom(int yLine) {
        int y = super.getY(), h = super.getHeight();
        y += ySpeed;
        if (y + h >= yLine && y < yLine) {
            ySpeed = -ySpeed;
            return true;
        }
        return false;
    }

    public boolean checkCollideLeft(int xLine) {
        int x = super.getX(), w = super.getWidth();
        if (x <= xLine && x + w > xLine) {
            xSpeed = -xSpeed;
            return true;
        }
        return false;
    }

    public boolean checkCollideRight(int xLine) {
        int x = super.getX(), w = super.getWidth();
        if (x + w >= xLine && x < xLine) {
            xSpeed = -xSpeed;
            return true;
        }
        return false;
    }
}
