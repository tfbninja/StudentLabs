package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class LineRunner {

    public static void main(String[] args) {
        //add test cases		
        Line test = new Line(1, 9, 14, 2);
        test.calculateSlope();
        test.print();
        
        test.setCoordinates(1, 7, 18, 3);
        test.calculateSlope();
        test.print();
        
        test.setCoordinates(6, 4, 2, 2);
        test.calculateSlope();
        test.print();
        
        test.setCoordinates(4, 4, 5, 3);
        test.calculateSlope();
        test.print();
        
        test.setCoordinates(1, 1, 2, 9);
        test.calculateSlope();
        test.print();
        
    }
}