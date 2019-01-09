package lab20a_pong_project;

import static java.lang.System.*;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class PaddleTestOne {

    public static void main(String args[]) {
        Paddle one = new Paddle();
        out.println(one);

        Paddle two = new Paddle(100, 100, 30, 50, Color.GREEN);
        out.println(two);

        Paddle three = new Paddle(100, 100, 30, 20, Color.GREEN, 6);
        out.println(three);

        out.println(three.equals(two));
        out.println(three.equals(three));
    }
}
