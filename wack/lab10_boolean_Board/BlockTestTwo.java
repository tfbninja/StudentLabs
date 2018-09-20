package lab10_boolean_Board.sols;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

//Name -
//Date -
//Lab  - BlockTestTwo 

public class BlockTestTwo {

    private Canvas canvas;

    
    public BlockTestTwo(int width, int height) {
        canvas = new Canvas(width, height);
    }

    public void drawBlocks() {
        Block one = new Block();
        one.draw(canvas);

        Block two = new Block(50, 50, 30, 30);
        two.draw(canvas);

        Block three = new Block(350, 350, 15, 15, Color.RED);
        three.draw(canvas);

        Block four = new Block(450, 50, 20, 60, Color.GREEN);
        four.draw(canvas);
        
        //add more test cases
    }
    
    public Canvas getCanvas() {
        return canvas;
    }
}