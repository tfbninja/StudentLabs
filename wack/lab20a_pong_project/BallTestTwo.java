package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class BallTestTwo extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    Block bg = new Block(0, 0, WIDTH, HEIGHT, Color.BLACK);
    Ball ball;
    RedrawTimer timer = new RedrawTimer();

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        ball = new Ball();
        ball.setXPos(0);
        ball.setYPos(0);
        ball.setXSpeed(1);
        ball.setYSpeed(7);
        ball.setColor(Color.LAWNGREEN);
        ball.setBounds(0, 0, WIDTH, HEIGHT);

        Scene scene = new Scene(root, WIDTH, HEIGHT);

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

        //private long lastFrameTime;
        @Override
        public void handle(long now) {
            bg.draw(canvas, bg.getColor());
            ball.setColor(Color.LAWNGREEN);
            ball.update(canvas);
        }
    }
}
