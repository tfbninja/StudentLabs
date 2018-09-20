/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class Pong extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    RedrawTimer timer = new RedrawTimer();
    private int leftscore;
    private int rightscore;

    //declare a ball, right paddle and left paddle
    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        leftscore = 0;
        rightscore = 0;
        //instantiate a ball that will randomly come out of the middle of the screen
        //  going to the right or left
        //instantiate a right paddle and left paddle
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			//Fill in the code for the keypress events
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    
                }
                if (event.getCode() == KeyCode.DOWN) {

                }
                if (event.getCode() == KeyCode.W) {

                }
                if (event.getCode() == KeyCode.S) {

                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {

                }
                if (event.getCode() == KeyCode.DOWN) {

                }
                if (event.getCode() == KeyCode.W) {

                }
                if (event.getCode() == KeyCode.S) {

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

    public class RedrawTimer extends AnimationTimer {
        int direction;

        @Override
        public void handle(long now) {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.clearRect(0, 0, WIDTH, HEIGHT);
            gc.setFont(new Font("Verdana", 14));
            gc.strokeText("Left Score:" + leftscore, 50, 550);
            gc.strokeText("Right Score:" + rightscore, 50,580);

            //check for ball collision with the top and bottom "wall" and the paddles
            //update all objects
            //draw all objects
            //check to see if the ball hits the left or right walls.
            //  If so, reset the ball in the middle and adjust the score


        }
    }
}
