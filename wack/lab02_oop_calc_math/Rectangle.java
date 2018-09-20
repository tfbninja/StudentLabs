package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Rectangle {

    private int length;
    private int width;
    private int perimeter;

    public void setLengthWidth(int len, int wid) {
        length = len;
        width = wid;
    }

    public void calculatePerimeter() {
        perimeter = 2*length+2*width;
    }

    public void print() {
        System.out.println("The perimeter is :: " + perimeter);
    }
}
