package lab10_boolean;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Map;
import java.util.HashMap;

public class RockPaperScissors {

    private String playChoice;
    private String compChoice;
    private Map<String, String> winner = new HashMap<>();

    public RockPaperScissors() {
        winner.put("paper rock", "paper");
        winner.put("rock scissors", "rock");
        winner.put("paper scissors", "scissors");
        winner.put("lizard scissors", "scissors");
        winner.put("paper spock", "paper");
        winner.put("scissors spock", "spock");
        winner.put("lizard rock", "rock");
        winner.put("lizard spock", "lizard");
        winner.put("rock spock", "spock");
        winner.put("lizard paper", "lizard");
        playChoice = "";
        compChoice = "";
    }

    public RockPaperScissors(String player) {
        this.playChoice = player;
    }

    public void setPlayers(String player) {
        this.playChoice = player;
    }

    public String setComputer() {
        double choice = Math.random();
        if (choice < 1 / 3.0) {
            return this.compChoice = "rock";
        } else if (choice < 2 / 3.0) {
            return this.compChoice = "scissors";
        } else {
            return this.compChoice = "paper";
        }
    }

    public String determineWinner() {
        String winner = "";
        if () {
            return winner;
        }
    }

    public String toString() {
        String output = "";
        return output;
    }
}
