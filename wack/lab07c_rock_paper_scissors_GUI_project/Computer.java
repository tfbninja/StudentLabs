package lab07c_rock_paper_scissors_GUI_project;

// A+ Computer Science  -  www.apluscompsci.com

//Computer class 
public class Computer {
    //instance / member variables

    private String choice;

    public Computer() {
        //call random set Choice	
    }

    public String getChoice() {
        return "";
    }

    public void randomSetChoice() {
        //use Math.random()
        //use switch case
    }

    /*
     didIWin(Player p) will return the following values
     0 - both players have the same choice
     1 - the computer had the higher ranking choice
     -1 - the player had the higher ranking choice
     */
    public int didIWin(Player p) {
        return -1;
    }

    public String toString() {
        return "";
    }
}