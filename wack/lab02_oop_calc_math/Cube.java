package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public class Cube {

    private double side;
    private double surfaceArea;

    public void setSide(double s) {
        side = s;
    }

    public void calculateSurfaceArea() {
        surfaceArea = 6 * Math.pow(side, 2.0);
    }

    public void print() {
        System.out.println("The surface area is :: " + (int)surfaceArea);
    }
}
