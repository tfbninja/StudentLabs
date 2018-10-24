package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
import java.util.Scanner;

public class GuessingGame {

    private int upperBound;
    private int num;
    private int runs = 0;
    private double wrongPercent = 1;

    public GuessingGame() {
        this.upperBound = 1;
    }

    public GuessingGame(int stop) {
        this.upperBound = stop;
    }

    public void setBound(int bound) {
        this.upperBound = bound;
    }

    public void playGame() {
        Scanner keyboard = new Scanner(System.in);
        int guess = 0;
        int guesses = 0;
        System.out.print("Guessing Game - how many numbers? ");
        setBound(keyboard.nextInt());
        this.num = (int) Math.floor(Math.random() * (this.upperBound + 1));

        while (guess != num && guesses <= 20) {
            System.out.print("Enter a number between 1 and " + this.upperBound + ": ");
            guess = keyboard.nextInt();
            if (guess > this.upperBound || guess < 1){
                System.out.println("Number out of range!");
            }
            guesses++;
        }
        if (guesses > 20) {
            System.out.println("You took more than 20 tries to guess " + this.num);
        } else {
            System.out.println("It took you " + guesses + " guesses to guess " + num);
        }
        this.runs++;
        this.wrongPercent *= (double) ((guesses-1) / (double)guesses);
        System.out.println("You guessed wrong " + Math.round(this.wrongPercent*100) + " percent of the time");

        System.out.print("Do you want to play again? ");
        boolean again = keyboard.next().substring(0,1).toLowerCase().equals("y");
        if (again){
            playGame();
        }

    }

    public String toString() {
        String output = String.valueOf(this.num);
        return output;
    }
}
