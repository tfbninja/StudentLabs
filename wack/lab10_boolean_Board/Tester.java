package lab10_boolean_Board;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  - 
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Tester extends Application {

    private static final int WIDTH = 610;
    private static final int HEIGHT = 610;

    public void start(Stage stage) {
        HBox root = new HBox();

        Board board = new Board();
        BlockTestTwo testTwo = new BlockTestTwo(WIDTH - 200, HEIGHT);

        testTwo.drawBlocks();

        board.drawBlocks();

        //root.getChildren().add(testTwo.getCanvas());
        root.getChildren().add(board.getCanvas());

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.setTitle("Switch the colors!");
        stage.show();
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                board.mouseClicked(event);
                if (board.isColor(board.getTopLeft(), Color.RED) && board.isColor(board.getTopRight(), Color.GREEN) && board.isColor(board.getBotLeft(), Color.BLUE) && board.isColor(board.getBotRight(), Color.YELLOW)) {
                    stage.setTitle("Its the Windows logo!");
                } else {
                    stage.setTitle("Not Quite..");
                }
            }
        });
    }

    public static void main(String args[]) {
        launch(args);

    }
}
