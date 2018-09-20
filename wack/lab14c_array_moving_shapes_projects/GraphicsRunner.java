package lab14c_array_moving_shapes_projects;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicsRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private Shape[] shapes;
    private Canvas canvas;
    
    public void start(Stage stage) throws Exception {
        RedrawTimer timer = new RedrawTimer();
        
        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        
        shapes = new Shape[4];
//        add shapes to the array
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.show();
        timer.start();
    }
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public class RedrawTimer extends AnimationTimer {

        @Override
        public void handle(long l) {
            canvas.getGraphicsContext2D().clearRect(0, 0, WIDTH, HEIGHT);
            for(Shape shape: shapes) {
                if (shape != null) {
                    shape.draw(canvas);
                    shape.move();
                }
            }
        }
        
    }
}