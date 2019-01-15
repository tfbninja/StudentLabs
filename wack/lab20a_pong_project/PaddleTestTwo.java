package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class PaddleTestTwo extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    private int paddleMargin = 15;
    private int paddleHeight = 100;
    private int paddleWidth = 25;
    private Block bg = new Block(0, 0, WIDTH, HEIGHT, Color.BLACK);
    private Ball ball;
    private Paddle left;
    private Paddle right;
    private RedrawTimer timer = new RedrawTimer();

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        //instantiate a Ball
        ball = new Ball(WIDTH / 2, HEIGHT / 2, 20, 20, Color.LAWNGREEN, 3, 4);
        ball.setBounds(0, 0, WIDTH, HEIGHT);

        //instantiate a left Paddle
        left = new Paddle(paddleMargin, HEIGHT / 2 - paddleHeight / 2, paddleWidth, paddleHeight, Color.BLUE, 6);
        left.setYBounds(0, HEIGHT);

        //instantiate a right Paddle
        right = new Paddle(WIDTH - paddleMargin - paddleWidth, HEIGHT / 2 - paddleHeight / 2, paddleWidth, paddleHeight, Color.RED, 6);
        right.setYBounds(0, HEIGHT);

        ball.addPaddles(left, right);
        left.setBall(ball);
        right.setBall(ball);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
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
            }
        });
        primaryStage.setTitle("Pong!");
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

    public class RedrawTimer extends AnimationTimer { //added for animation lab05

        @Override
        public void handle(long now) {
            bg.draw(canvas, bg.getColor());
            left.update(canvas);
            right.update(canvas);
            ball.update(canvas);
        }
    }
}
