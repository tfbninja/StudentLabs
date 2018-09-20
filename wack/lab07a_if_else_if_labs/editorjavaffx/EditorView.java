package editorjavaffx;

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
public class EditorView extends Application {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 100;
    private static Canvas canvas;

    public static Ed editor;

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        editor = new Editor1("big", "dog");
        //EditorControl.edControl(scene);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {
                    editor = editor.leftArrow();
                }
                else if (event.getCode() == KeyCode.RIGHT) {
                    
                    editor = editor.rightArrow();
                }
                else {
                    editor = editor.insertString((event.getCode().toString().toLowerCase().charAt(0)));
                }
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.clearRect(0, 0, EditorView.WIDTH, EditorView.HEIGHT);
                gc.setFont(new Font("Arial", 24));
                gc.setFill(Color.BLACK);
                gc.fillText(editor.getBefore() + "\u25c4\u25ba" + editor.getAfter(), 30, 30);
            }
        });

		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.clearRect(0, 0, EditorView.WIDTH, EditorView.HEIGHT);
		gc.setFont(new Font("Arial", 24));
		gc.setFill(Color.BLACK);
		gc.fillText(editor.getBefore() + "\u25c4\u25ba" + editor.getAfter(), 30, 30);        primaryStage.setTitle("EDITOR!");
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
