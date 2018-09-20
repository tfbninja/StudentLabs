package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle test = new Rectangle();
        test.setLengthWidth(2, 6);
        test.calculatePerimeter();
        test.print();

        test.setLengthWidth(12, 5);
        test.calculatePerimeter();
        test.print();
        
        test.setLengthWidth(131, 75);
        test.calculatePerimeter();
        test.print();
        
        test.setLengthWidth(20, 25);
        test.calculatePerimeter();
        test.print();
        
        test.setLengthWidth(9, 256);
        test.calculatePerimeter();
        test.print();
        
        test.setLengthWidth(36, 72);
        test.calculatePerimeter();
        test.print();

        	
    }
}