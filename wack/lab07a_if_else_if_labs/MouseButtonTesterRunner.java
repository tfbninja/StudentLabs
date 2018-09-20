
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class MouseButtonTesterRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;

    @Override
    public void start(Stage primaryStage) {
		StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        MouseButtonTester test = new MouseButtonTester();
        root.getChildren().add(test.getCanvas());
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isPrimaryButtonDown()) { //left mouse button
                    test.paintLeft(event.getX(), event.getY());
                }
                if (event.isSecondaryButtonDown()) { //right mouse button
                    //call the method to draw something if the right mouse button is pressed
                }
            }
        });

        primaryStage.setTitle("Hello World!");
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
