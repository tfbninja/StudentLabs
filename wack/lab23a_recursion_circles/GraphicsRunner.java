package lab23a_recursion_circles;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class GraphicsRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        new RecursiveCircles().draw(canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);

        primaryStage.setTitle("Recursive Circles");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
