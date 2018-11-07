package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.HashMap;
import java.util.Scanner;

public class DogFood {

    private double amount;
    private static final HashMap<Integer, Double> cupsPerPound = new HashMap<>();

    static {
        /*
         * this HashMap<Integer, Double>, cupsPerPound, represents the number of
         * cups of dog food needed for a puppy weighing less than or equal to
         * the Key<Integer>, and more than the previous Key<Integer>
         */
        cupsPerPound.put(4, 3.5);
        cupsPerPound.put(7, 7.0);
        cupsPerPound.put(9, 10.5);
        cupsPerPound.put(19, 14.0);
        cupsPerPound.put(39, 24.0);
        cupsPerPound.put(59, 31.5);
        cupsPerPound.put(79, 42.0);
        cupsPerPound.put(10000, 52.5);
    }

    public DogFood() {
        this.amount = 0;
    }

    public DogFood(String line) {
        setLine(line);
    }

    public double getAmount() {
        return this.amount;
    }

    public void setLine(String line) {
        Scanner chopper = new Scanner(line);
        double cups = 0; // start with 0 cups needed

        while (chopper.hasNextInt()) { // while there is another measurement...
            int weight = chopper.nextInt(); // get the weight
            while (!cupsPerPound.containsKey(weight)) { // assuming the weight isn't exactly on the line, add one until it is
                weight++;
            }
            cups += cupsPerPound.get(weight); // then get the number of cups needed for that weight
        }
        this.amount = Math.ceil(cups / 60.0); // divide the cups by 60, and if there is any remainder, we need another one, hence Math.ceil()
    }

    public String toString() {
        return (int) this.amount + " - 10 POUND BAGS";
    }
}
