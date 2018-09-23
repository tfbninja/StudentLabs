package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic {

    private int a, b, c;
    private double rootOne;
    private double rootTwo;

    public Quadratic() {
        a = 0;
        b = 0;
        c = 0;
    }

    public Quadratic(int quadA, int quadB, int quadC) {
        a = quadA;
        b = quadB;
        c = quadC;
    }

    public void setEquation(int quadA, int quadB, int quadC) {
        a = quadA;
        b = quadB;
        c = quadC;
    }

    public void calcRoots() {
        double negB = b*-1;
        double bSqrd = Math.pow(b, 2);
        double twoA = a * 2.0;
        rootOne = (negB + Math.sqrt(bSqrd - (4.0 * a * c))) / twoA;
        rootTwo = (negB - Math.sqrt(bSqrd - (4.0 * a * c))) / twoA;
    }

    public void print() {
        System.out.println("rootone :: " + rootOne);
        System.out.println("roottwo :: " + rootTwo);
    }

    public void dewIt(int quadA, int quadB, int quadC) {
        setEquation(quadA, quadB, quadC);
        calcRoots();
        print();
    }
}
