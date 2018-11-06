package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
import java.util.HashMap;

public class DogFood {

    private double amount;
    private static final HashMap<Integer, Double> cupsPerPound = new HashMap<>();
    
    static {
        cupsPerPound.put(4,3.5);
        cupsPerPound.put(7,7.0);
        cupsPerPound.put(9,10.5);
        cupsPerPound.put(19,14.0);
        cupsPerPound.put(39,24.0);
        cupsPerPound.put(59,31.5);
        cupsPerPound.put(79,42.0);
        cupsPerPound.put(10000,52.5);
    }

    public DogFood() {
        this.amount = 0;
    }

    public DogFood(String line) {
        Scanner chopper = new Scanner(line);
        double cups = 0;

        while (chopper.hasNextInt()){
            
        }

    }

    public double getAmount() {
        return 0;
    }

    public String toString() {
        return "";
    }
}