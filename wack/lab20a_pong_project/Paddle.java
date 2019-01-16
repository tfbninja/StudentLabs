package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Paddle extends Block implements Renderable, Updateable {

    private int speed;
    private int velocity = 0;
    private Ball ball;
    private double speedRatio;

    public Paddle() {
        super(10, 10, 10, 40, Color.BLACK);
        speed = 5;
    }

    public Paddle(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
    }

    public Paddle(int x, int y, int w, int h, Color color, int speed) {
        this(x, y, w, h, color);
        this.speed = speed;
    }

    public void setBall(Ball b) {
        this.ball = b;
        speedRatio = speed / Math.sqrt(Math.pow(ball.getXSpeed(), 2) + Math.pow(ball.getYSpeed(), 2));
    }

    public void up() {
        velocity = -speed;
    }

    public void down() {
        velocity = speed;
    }

    public void stop() {
        velocity = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int amt) {
        speed = amt;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int amt) {
        velocity = amt;
    }

    public double calcBallSpeed(Ball ball) {
        return Math.sqrt(Math.pow(ball.getXSpeed(), 2) + Math.pow(ball.getYSpeed(), 2));
    }

    @Override
    public void update(Canvas canvas) {
        speed = (int) (calcBallSpeed(ball) * speedRatio);
        if (velocity < 0) {
            if (!super.getYBoundsOn() || super.getY() > super.getMinY()) {
                super.changeY(velocity);
            }

        }

        if (velocity
                > 0) {
            if (!super.getYBoundsOn() || super.getY() + super.getHeight() < super.getMaxY()) {
                super.changeY(velocity);
            }
        }
        //collideBall();

        super.draw(canvas,
                super.getColor());
    }

    public void collideBall() {
        int bX = ball.getX(), bW = ball.getWidth(), x = super.getX(), y = super.getY(), w = super.getWidth(), h = super.getHeight(), bY = ball.getY(), bH = super.getHeight();
        if (ball.getXSpeed() < 0) {
            // right paddle
            if (bX <= x + w && bX >= x) {
                if (bY < y + h && bY + bH >= y) {
                    ball.setXSpeed(-Math.abs(ball.getXSpeed()));
                }
            }
        } else {
            // left paddle
            if (bX + bW >= x && bX < x) {
                if (bY < y && bY + bH <= y + h) {
                    ball.setXSpeed(-Math.abs(ball.getXSpeed()));
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + speed + " " + velocity;
    }
}
