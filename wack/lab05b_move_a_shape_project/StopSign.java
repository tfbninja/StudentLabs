package lab05b_move_a_shape_project;

// A+ Computer Science  -  www.apluscompsci.com
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

//Name -
//Date -
//Class -
//Lab  -
public class StopSign {
    //instance variables

    private int xPos;
    private int yPos;
    private int size;
    private String color; //Hex color
    private int xSpeed;
    private int ySpeed;
    private boolean colDetected = false;

    public StopSign() {
        xPos = 0;
        yPos = 0;
        size = 0;
        color = "000000";
        xSpeed = 0;
        ySpeed = 0;
    }

    public StopSign(int x, int y, int sz, String col, int xSpd, int ySpd) {
        xPos = x;
        yPos = y;
        size = sz;
        color = col;
        xSpeed = xSpd;
        ySpeed = ySpd;
    }

    public void setVars(int x, int y, int sz, String col, int xSpd, int ySpd) {
        xPos = x;
        yPos = y;
        size = sz;
        color = col;
        xSpeed = xSpd;
        ySpeed = ySpd;
    }

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.web(color));
        double v = size / (2 + Math.sqrt(2.0));
        double sideLen = v * Math.sqrt(2.0);
        //X-Coordinates for stop sign, starting at the topmost point on the left line
        double[] xCoords1 = new double[]{xPos, xPos + v, xPos + v + sideLen, xPos + v + sideLen + v, xPos + v + sideLen + v, xPos + v + sideLen, xPos + v, xPos};
        //Y-Coordinates for stop sign, starting at the same place
        double[] yCoords2 = new double[]{yPos + v, yPos, yPos, yPos + v, yPos + v + sideLen, yPos + v + sideLen + v, yPos + v + sideLen + v, yPos + v + sideLen};
        graphics.setFill(Color.web(color));
        graphics.setStroke(Color.RED);
        graphics.setLineWidth(4);
        graphics.fillPolygon(xCoords1, yCoords2, 8); //draw bordering red octagon
        graphics.setFont(new Font("IMPACT", (int) (0.16 * size)));
        graphics.setFill(Color.WHITE);
        graphics.fillText("STOP killing\nFrench people\nto make\nfrench fries", xPos + v / 1.5, yPos + v / 1.15, sideLen + v);

    }

    /*
     *This draw method will be used to erase the shape.
     */
    public void clear(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public void move() {
        //Bottom detection
        if (yPos + size > GraphicsRunner.getHeight()) {
            ySpeed = -ySpeed;
        }
        //Top detection
        if (yPos < 0) {
            ySpeed = -ySpeed;
        }
        //Left detection
        if (xPos < 0) {
            xSpeed = -xSpeed;
        }
        //Right detection
        if (xPos + size > GraphicsRunner.getWidth()) {
            xSpeed = -xSpeed;
        }

        xPos = xPos + xSpeed;
        yPos = yPos + ySpeed;
    }

    public int setX(int x) {
        xPos = x;
        return xPos;
    }

    public int getX() {
        return xPos;
    }

    public int setXSpeed(int amt) {
        xSpeed = amt;
        return xSpeed;
    }

    public int setYSpeed(int amt) {
        ySpeed = amt;
        return ySpeed;
    }

    public String setSpeed(int xSpd, int ySpd) {
        xSpeed = xSpd;
        ySpeed = ySpd;
        return String.valueOf(xSpeed) + " " + ySpeed;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public String getSpeed() {
        return String.valueOf(xSpeed) + " " + ySpeed;
    }

    public void bounce(Shape entity) {
        entity.
    }

    public String toString() {
        return xPos + " " + yPos + " " + size + " " + color + " " + xSpeed + " " + ySpeed;
    }
}
