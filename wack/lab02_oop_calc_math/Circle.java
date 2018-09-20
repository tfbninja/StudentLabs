package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Circle {

    private double radius;
    private double area;

    public void setRadius(double rad) {
        radius = rad;
    }

    public void calculateArea() {
        area = Math.PI*Math.pow(radius, 2);
    }

    public void print() {
        System.out.println("The area is :: " + area);
    }
}