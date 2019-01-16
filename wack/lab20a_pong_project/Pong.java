package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;

import javafx.stage.Screen;

/**
 *
 * @author wkranz
 */
public class Pong extends Application {

    private static int width = 800;
    private static int height = 600;
    private static int smallW = 800;
    private static int smallH = 600;
    private static Canvas canvas;
    RedrawTimer timer = new RedrawTimer();
    private int leftScore = 0;
    private int rightScore = 0;
    private int paddleMargin = 15;
    private int paddleHeight = 100;
    private int paddleWidth = 25;
    private Block bg = new Block(0, 0, width, height, Color.DARKGREY);
    private Ball ball;
    private Paddle left;
    private Paddle right;

    private double apprxmtBallStartingSpeed = 5.0;
    private double ballAccelerationPerHit = 0.5;

    private int paddleSpeed = 6;

    private boolean paused = false;
    private boolean preserveVelocities = false;
    private double xVel = 0.0;
    private double yVel = 0.0;

    @Override
    public void start(Stage primaryStage) {
        Rectangle2D border = Screen.getPrimary().getBounds();
        width = (int) border.getWidth();
        height = (int) border.getHeight();
        canvas = new Canvas(width, height);
        canvas.setWidth(width);
        canvas.setHeight(height);
        bg.setWidth(width);
        bg.setHeight(height);
        primaryStage.setMinWidth(smallW);
        primaryStage.setMinHeight(smallH);
        primaryStage.setResizable(false);
        primaryStage.setWidth(smallW);
        primaryStage.setHeight(smallH);
        primaryStage.setFullScreen(true);
        StackPane root = new StackPane();

        root.getChildren().add(canvas);
        ball = new Ball(width / 2, height / 2, 20, 20, Color.LAWNGREEN, apprxmtBallStartingSpeed, ballAccelerationPerHit);
        ball.setBounds(0, 0, width, height);

        //instantiate a left Paddle
        left = new Paddle(paddleMargin, height / 2 - paddleHeight / 2, paddleWidth, paddleHeight, Color.BLUE, paddleSpeed);
        left.setYBounds(0, height);

        //instantiate a right Paddle
        right = new Paddle(width - paddleMargin - paddleWidth, height / 2 - paddleHeight / 2, paddleWidth, paddleHeight, Color.RED, paddleSpeed);
        right.setYBounds(0, height);

        ball.addPaddles(left, right);
        left.setBall(ball);
        right.setBall(ball);
        Scene scene = new Scene(root, width, height);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    right.up();
                }
                if (event.getCode() == KeyCode.DOWN) {
                    right.down();
                }
                if (event.getCode() == KeyCode.W) {
                    left.up();
                }
                if (event.getCode() == KeyCode.S) {
                    left.down();
                }
            }
        });
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int mX = (int) event.getX();
                int mY = (int) event.getY();
                if (event.isPrimaryButtonDown()) {
                    ball.setXPos(mX);
                    ball.setYPos(mY);
                    ball.setXSpeed(xVel);
                    ball.setYSpeed(yVel);
                } else if (event.isSecondaryButtonDown()) {
                    xVel = ball.getXSpeed();
                    yVel = ball.getYSpeed();
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    right.stop();
                }
                if (event.getCode() == KeyCode.DOWN) {
                    right.stop();
                }
                if (event.getCode() == KeyCode.W) {
                    left.stop();
                }
                if (event.getCode() == KeyCode.S) {
                    left.stop();
                }
                if (event.getCode() == KeyCode.P) {
                    paused = !paused;
                }
                if (event.getCode() == KeyCode.F11) {
                    primaryStage.setTitle("Pranked");
                }
            }
        });
        primaryStage.setTitle("The game of realizing that you should probably go outside and play some tennis or badminton.");
        primaryStage.setFullScreenExitHint("Press F11 to exit full screen...or don't");
        primaryStage.setScene(scene);
        primaryStage.show();
        timer.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public class RedrawTimer extends AnimationTimer {

        @Override
        public void handle(long now) {
            /*
            Rectangle2D border = Screen.getPrimary().getBounds();
            width = (int) border.getWidth();
            height = (int) border.getHeight();
            canvas.setWidth(width);
            canvas.setHeight(height);
            bg.setWidth(width);
            bg.setHeight(height);
             */
            if (!paused) {
                GraphicsContext gc = canvas.getGraphicsContext2D();
                bg.draw(canvas, bg.getColor()); // clear background
                gc.setFont(new Font("Impact", 50));
                gc.setFill(bg.getColor().invert()); // 'cuz dark theme kicks butt
                // draw scores
                gc.fillText("" + leftScore, width / 2 - 100 - gc.getFont().getSize() / 2, 50);
                gc.fillText("" + rightScore, width / 2 + 100, 50);
                // draw ball speed (debug only)
                gc.setFont(new Font("Impact", 25));
                try {
                    gc.fillText("X speed: " + String.valueOf(ball.getXSpeed()).substring(0, 5) + ", Y speed: " + String.valueOf(ball.getYSpeed()).substring(0, 5), width / 2 - gc.getFont().getSize() / 2 * 15, 150);
                } catch (StringIndexOutOfBoundsException e) {
                    gc.fillText("X speed: " + ball.getXSpeed() + ", Y speed: " + ball.getYSpeed(), width / 2 - gc.getFont().getSize() / 2 * 15, 150);

                }

                left.update(canvas);
                right.update(canvas);
                ball.update(canvas);

                int scoreChange = ball.pongBehavior();
                if (scoreChange == -1) {
                    rightScore++;
                } else if (scoreChange == 1) {
                    leftScore++;
                }
            }
        }
    }
}
