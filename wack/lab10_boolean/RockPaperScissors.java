package lab10_boolean;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {

    private String playChoice;
    private String compChoice;
    private Map<String, String> winner = new HashMap<>();
    private int playWins = 0;
    private int compWins = 0;

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
        this.setPlayers(player);
    }

    public void setPlayers(String player) {
        player = player.substring(0, 1).toLowerCase();
        if (player.equals("r")) {
            player = "rock";
        } else if (player.equals("p")) {
            player = "paper";
        } else if (player.equals("s")) {
            player = "scissors";
        } else if (player.equals("l")) {
            player = "lizard";
        } else {
            player = "spock";
        }
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
        this.playChoice = player;
    }

    public String setComputer() {
        double choice = Math.random();
        if (choice < 0.2) {
            return this.compChoice = "rock";
        } else if (choice < 0.4) {
            return this.compChoice = "scissors";
        } else if (choice < 0.6) {
            return this.compChoice = "paper";
        } else if (choice < 0.8) {
            return this.compChoice = "lizard";
        } else {
            return "spock";
        }
    }

    public String determineWinner() {
        String builder;
        if (this.playChoice.compareTo(this.compChoice) < 0) {
            builder = this.playChoice + " " + this.compChoice;
        } else {
            builder = this.compChoice + " " + this.playChoice;
        }
        return winner.get(builder);
    }

    public String toString() {
        String output = "Player had " + this.playChoice + "\nComputer had " + this.compChoice + "\n";
        System.out.println(this.playChoice);
        if (this.playChoice.equals(this.compChoice)) {
            output = "Player had " + this.playChoice + "\nComputer had " + this.compChoice + "\n!Draw Game!";
        } else if (determineWinner().equals(this.playChoice)) {
            output += "!Player wins <<" + this.playChoice.substring(0, 1).toUpperCase() + this.playChoice.substring(1) + " beats " + this.compChoice.substring(0, 1).toUpperCase() + this.compChoice.substring(1) + ">>!";
            this.playWins++;
        } else {
            output += "!Computer wins <<" + this.compChoice.substring(0, 1).toUpperCase() + this.compChoice.substring(1) + " beats " + this.playChoice.substring(0, 1).toUpperCase() + this.playChoice.substring(1) + ">>!";
            this.compWins++;
        }
        output += "\nYour wins: " + this.playWins + "\nComputer wins: " + this.compWins;
        return output;
    }
}
