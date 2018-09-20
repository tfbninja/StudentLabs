package lab07b_u_draw_it_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GraphicsRunner extends Application {
    
    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    private static Canvas canvas;
    private static Tablet tablet;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        
        canvas = new Canvas(WIDTH, HEIGHT);
        
        root.getChildren().add(canvas);
        
        tablet = new Tablet();
        
        RedrawTimer timer = new RedrawTimer();
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                tablet.keyPressed(event);
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                tablet.keyReleased(event);
            }
        });
        
        primaryStage.setTitle("Moving Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
        timer.start();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public class RedrawTimer extends AnimationTimer {
        
        @Override
        public void handle(long now) {
            tablet.paint(canvas);
        }
        
    }
    
}
