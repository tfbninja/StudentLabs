package lab23f_recursion_garbage;

import java.awt.Color;

public class GridTester {

    public static void main(String[] args) {
        Grid gridTest = new Grid(2, 2);

        System.out.println(gridTest.getNumRows());
        System.out.println(gridTest.getNumCols());

        gridTest.setSpot(0, 0, new ColoredCell(3, 3, false));
        System.out.println(gridTest);

        gridTest.setSpot(1, 1, new ColoredCell(100, 100, 4, 4, true));
        System.out.println(gridTest);

        gridTest.setSpot(1, 1, new ColoredCell(200, 200, 20, 20, false, Color.RED));
        System.out.println(gridTest);

        System.out.println(gridTest.getSpot(1, 0));
        System.out.println(gridTest.getSpot(0, 1));
    }
}
