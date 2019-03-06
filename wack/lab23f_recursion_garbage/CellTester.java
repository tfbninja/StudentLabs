package lab23f_recursion_garbage;

import java.awt.Color;

public class CellTester {

    public static void main(String[] args) {
        Cell CellOne = new ColoredCell();
        System.out.println(CellOne);

        Cell redChecker = new ColoredCell(false);
        System.out.println(redChecker);

        Cell theShoe = new ColoredCell(100, 100, true);
        System.out.println(theShoe);

        Cell bishop = new ColoredCell(200, 200, 20, 20, true, Color.GREEN);
        System.out.println(bishop);
    }
}
