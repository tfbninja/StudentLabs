package lab10_boolean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RockPaperScissors {

    private String playChoice;
    private String compChoice;

    private boolean ai;
    // this hash map takes two alphabetically-sorted values separated by a space
    // and returns the winner of the two as determined by:
    // https://cdn.instructables.com/FIU/AIWE/I7Q0TCUT/FIUAIWEI7Q0TCUT.LARGE.jpg
    private Map<String, String> winner = new HashMap<String, String>() {
        {
            put("paper rock", "paper");
            put("rock scissors", "rock");
            put("paper scissors", "scissors");
            put("lizard scissors", "scissors");
            put("paper spock", "paper");
            put("scissors spock", "spock");
            put("lizard rock", "rock");
            put("lizard spock", "lizard");
            put("rock spock", "spock");
            put("lizard paper", "lizard");
        }
    };
    private int playWins = 0;
    private int compWins = 0;
    private ArrayList<String> prevMoves = new ArrayList<>();

    public RockPaperScissors() {
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
        this.playChoice = player;
        this.prevMoves.add(player);
    }

    public int biggestFiveInt(int one, int two, int three, int four, int five) {
        return biggest(biggest(biggest(one, two), biggest(three, four)), five);
    }

    public int biggest(int one, int two) {
        if (one > two) {
            return one;
        }
        return two;
    }

    public boolean fiveEquals(int one, int two, int three, int four, int five) {
        boolean tempOne = one == two || one == three || one == four || one == five;
        boolean tempTwo = two == three || two == four || two == five;
        boolean tempThree = three == four || three == five;
        boolean tempFour = four == five;
        return tempOne || tempTwo || tempThree || tempFour;
    }

    public String setComputer() {
        double choice = Math.random();
        //System.out.println(choice); // debug
        if (ai) {
            // ai way
            // this is 'simply' seeing what move they most often do and doing the one
            // that beats it
            int rkCount = Collections.frequency(prevMoves, "rock");
            int prCount = Collections.frequency(prevMoves, "paper");
            int ssCount = Collections.frequency(prevMoves, "scissors");
            int ldCount = Collections.frequency(prevMoves, "lizard");
            int skCount = Collections.frequency(prevMoves, "spock");
            int mostCount = biggestFiveInt(rkCount, prCount, ssCount, ldCount, skCount);
            if (fiveEquals(rkCount, prCount, ssCount, ldCount, skCount)) {
                ArrayList<String> choices = new ArrayList<String>();
                if (rkCount == mostCount) {
                    choices.add("rock");
                }
                if (ssCount == mostCount) {
                    choices.add("scissors");
                }
                if (prCount == mostCount) {
                    choices.add("paper");
                }
                if (ldCount == mostCount) {
                    choices.add("lizard");
                }
                if (skCount == mostCount) {
                    choices.add("spock");
                }
                Random random = new Random();
                int newChoice = random.nextInt(choices.size());
                String thinkPlayerChoice = choices.get(newChoice);
                String[] options = {"rock", "paper", "scissors", "lizard", "spock"};
                for (String i : options) {
                    if (!i.equals(thinkPlayerChoice)) {
                        if (whoWins(i, thinkPlayerChoice).equals(i)) {
                            return this.compChoice = i;
                        }
                    }
                }
            } else {
                String thinkPlayerChoice;
                if (rkCount == mostCount) {
                    thinkPlayerChoice = "rock";
                } else if (ssCount == mostCount) {
                    thinkPlayerChoice = "scissors";
                } else if (prCount == mostCount) {
                    thinkPlayerChoice = "paper";
                } else if (ldCount == mostCount) {
                    thinkPlayerChoice = "lizard";
                } else {
                    thinkPlayerChoice = "spock";
                }
                String[] options = {"rock", "paper", "scissors", "lizard", "spock"};
                for (String i : options) {
                    if (!i.equals(thinkPlayerChoice)) {
                        if (whoWins(i, thinkPlayerChoice).equals(i)) {
                            return this.compChoice = i;
                        }
                    }
                }
            }
            // if for some reason the above statements didn't execute properly, scissors is always a decent choice;
            return this.compChoice = "scissors";

        } else {
            // random choice
            if (choice < 0.2) {
                return this.compChoice = "rock";
            } else if (choice < 0.4) {
                return this.compChoice = "scissors";
            } else if (choice < 0.6) {
                return this.compChoice = "paper";
            } else if (choice < 0.8) {
                return this.compChoice = "lizard";
            } else {
                return this.compChoice = "spock";
            }
        }
    }

    public String whoWins(String one, String two) {
        String builder;
        if (one.compareTo(two) < 0) {
            builder = one + " " + two;
        } else {
            builder = two + " " + one;
        }
        return winner.get(builder);
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

    public void setAI(boolean ai) {
        this.ai = ai;
    }

    public String toString() {
        String output = "Player had " + this.playChoice + "\nComputer had " + this.compChoice + "\n";
        //System.out.println(this.playChoice); // debug
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
