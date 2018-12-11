package lab18j_list_of_references__winter_scene_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicsRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Canvas canvas;

    public void start(Stage stage) {
        canvas = new Canvas();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);
        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.setTitle("THE WINTER SCENE PROJECT");
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
