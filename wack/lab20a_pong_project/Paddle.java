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
    // private String direction; // why... so unnecessary. Remember Algebra 1 when we learned about negative numbers? yeah....
    // there is no need to use volatile string commands here... always use math when possible

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

    @Override
    public void update(Canvas canvas) {
        if (velocity < 0) {
            if (!super.getYBoundsOn() || super.getY() > super.getMinY()) {
                super.changeY(velocity);
            }
        }

        if (velocity > 0) {
            if (!super.getYBoundsOn() || super.getY() + super.getHeight() < super.getMaxY()) {
                super.changeY(velocity);
            }
        }

        super.draw(canvas,
                super.getColor());
    }

    @Override
    public String toString() {
        return super.toString() + " " + speed + " " + velocity;
    }
}
