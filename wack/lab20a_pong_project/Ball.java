package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Ball extends Block implements Renderable, Updateable {

    private int xSpeed;
    private int ySpeed;

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

    public Ball(int xPos, int yPos, int width, int height, Color color) {
        super(xPos, yPos, width, height, color);
    }

    public Ball(int xPos, int yPos, int width, int height, Color color, int xSpeed, int ySpeed) {
        this(xPos, yPos, width, height, color);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void addPaddles(Block left, Block right) {
        this.lP = left;
        this.rP = right;
    }

    public void toggleX() {
        System.out.println("X toggled");
        xSwitches++;
        xSpeed = -xSpeed;
    }

    public void toggleY() {
        System.out.println("Y toggled");
        ySwitches++;
        ySpeed = -ySpeed;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(int amt) {
        this.xSpeed = amt;
    }

    public void setYSpeed(int amt) {
        this.ySpeed = amt;
    }

    @Override
    public String toString() {
        return super.toString() + " " + xSpeed + " " + ySpeed;
    }

    @Override
    public void update(Canvas canvas) {
        xSwitches = 0;

        int[] bounds = super.getBounds();
        if (super.getXBoundsOn()) {
            checkCollideLeft(bounds[0]);
            checkCollideRight(bounds[2]);
        }
        if (super.getYBoundsOn()) {
            checkCollideTop(bounds[1]);
            checkCollideTop(bounds[3]);
        }
        /*
         * for (Block b : collidables) {
         * this.checkCollisions(b);
         * if (this.inCollisionWith(b)) {
         * System.out.println("In collision");
         * toggleX();
         * super.changeX(xSpeed * 2);
         * toggleX();
         * }
         * }
         */
        this.checkLeftPaddle(lP);
        this.checkRightPaddle(rP);

        super.changeX(xSpeed);
        super.changeY(ySpeed);
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

    public void checkCollideLeft(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        x += xSpeed;
        y += ySpeed;
        if (bX + bW >= x && x > bX) {
            if (y + h > bY && y < bY + bH) {
                toggleX();
            }
        }
    }

    public void checkLeftPaddle(Block b) {
        //int bX = b.getX(), bW = b.getWidth(), x = super.getX(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        checkCollideRight(b);
        checkCollideTop(b);
        checkCollideBottom(b);
    }

    public void checkRightPaddle(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), y = super.getY(), w = super.getWidth(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        checkCollideLeft(b);
        checkCollideTop(b);
        checkCollideBottom(b);
    }

    public void checkCollideRight(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        x += xSpeed;
        y += ySpeed;
        if (x + w >= bX && x < bX) {
            if (y + h > bY && y < bY + bH) {
                toggleX();
            }
        }
    }

    public void checkCollideTop(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        x += xSpeed;
        y += ySpeed;
        if (y <= bY + bH && y > bY) {
            if (x + w > bX && x < bX + bW) {
                ySpeed = -Math.abs(ySpeed);
            }
        }
    }

    public void checkCollideBottom(Block b) {
        int bX = b.getX(), bW = b.getWidth(), x = super.getX(), w = super.getWidth(), y = super.getY(), h = super.getHeight(), bY = b.getY(), bH = super.getHeight();
        x += xSpeed;
        y += ySpeed;
        if (y + h >= bY && y < bY + bH) {
            if (x + w > bX && x < bX + bW) {
                toggleY();
            }
        }
    }

    public void checkCollideTop(int yLine) {
        int y = super.getY(), h = super.getHeight();
        y += ySpeed;
        if (y <= yLine && y + h > yLine) {
            toggleY();
        }
    }

    public void checkCollideBottom(int yLine) {
        int y = super.getY(), h = super.getHeight();
        y += ySpeed;
        if (y + h >= yLine && y < yLine) {
            toggleY();
        }
    }

    public void checkCollideLeft(int xLine) {
        int x = super.getX(), w = super.getWidth();
        x += xSpeed;
        if (x <= xLine && x + w > xLine) {
            toggleX();
        }
    }

    public void checkCollideRight(int xLine) {
        int x = super.getX(), w = super.getWidth();
        x += xSpeed;
        if (x + w >= xLine && x < xLine) {
            toggleX();
        }
    }

    public void checkCollisions(Block b) {
        if (xSpeed < 0) {
            checkCollideLeft(b);
        } else {
            checkCollideRight(b);
        }
        if (ySpeed < 0) {
            checkCollideTop(b);
        } else {
            checkCollideBottom(b);
        }
    }

    public void checkCollisions(int leftX, int topY, int rightX, int bottomY) {
        if (xSpeed < 0) {
            checkCollideLeft(leftX);
        } else {
            checkCollideRight(rightX);
        }
        if (ySpeed < 0) {
            checkCollideTop(topY);
        } else {
            checkCollideBottom(bottomY);
        }
    }

}
