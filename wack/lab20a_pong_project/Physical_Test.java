package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Tim Barber
 */
public class Physical_Test extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private Canvas canvas;
    private RedrawTimer timer = new RedrawTimer();
    private Block bg = new Block(0, 0, WIDTH, HEIGHT, Color.BLACK);

    private Sphere ball = new Sphere(100, 300, 125, 100, -1, 0, 100, 20);
    private Sphere ball2 = new Sphere(100, 500, 125, 5, 1, 5, 200, 30);
    private Sphere ball3 = new Sphere(500, 300, 125, 0, -1, 0, 2000, 50);

    private int totalMomentum;

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        ball.setStroke(Color.RED);
        ball2.setStroke(Color.BLUEVIOLET);
        ball3.setStroke(Color.FORESTGREEN);
        int[] bounds = {0, WIDTH, 0, HEIGHT, 0, 250};
        ball.setBounds(bounds);
        ball2.setBounds(bounds);
        ball3.setBounds(bounds);

        Scene scene = new Scene(root, WIDTH, HEIGHT);

        primaryStage.setTitle("yeet");
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
            totalMomentum = ball.getMomentum() + ball2.getMomentum() + ball3.getMomentum();
            bg.draw(canvas, bg.getColor());
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.RED);
            gc.setFont(new Font("Verdana", 15));
            gc.fillText("Red pos: " + ball.getX() + ", " + ball.getY() + ", " + ball.getZ(), 25, 25);
            gc.fillText("Blue pos: " + ball2.getX() + ", " + ball2.getY() + ", " + ball2.getZ(), 225, 25);
            gc.fillText("Green pos: " + ball3.getX() + ", " + ball3.getY() + ", " + ball3.getZ(), 425, 25);
            gc.fillText("Total momentum in the system: " + totalMomentum, 25, 50);
            ball.draw2D(canvas);
            gc.setFont(new Font("Verdana", 10));
            gc.fillText(ball.getWeight() + "", ball.getX() - ball.getRadius() / 2, ball.getY() - 4);
            ball2.draw2D(canvas);
            gc.fillText(ball2.getWeight() + "", ball2.getX() - ball2.getRadius() / 2, ball2.getY() - 4);
            ball3.draw2D(canvas);
            gc.fillText(ball3.getWeight() + "", ball3.getX() - ball3.getRadius() / 2, ball3.getY() - 4);
            ball.updatePosition();
            ball2.updatePosition();
            ball3.updatePosition();
            ball.bounceBounds();
            ball2.bounceBounds();
            ball3.bounceBounds();
            ball.handlePotentialCollision(ball2);
            ball.handlePotentialCollision(ball3);
            ball2.handlePotentialCollision(ball3);
        }
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
