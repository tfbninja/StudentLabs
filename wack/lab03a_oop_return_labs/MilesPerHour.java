package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour {

    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0, 0, 0);
        mph = 0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }
    public void calcMPH() {
        mph = distance / (hours + (minutes/60.0));
    }


    public void print() {
        System.out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + mph + "MPH.");
    }
    
    public void dewIt(int dist, int hrs, int mins){
        setNums(dist, hrs, mins);
        calcMPH();
        print();
    }
}