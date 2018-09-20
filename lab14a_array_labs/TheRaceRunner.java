package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class TheRaceRunner {

    public static void main(String args[]) {
        TheRace r = new TheRace();
        System.out.println(r);
        while (r.turn()) {
            System.out.println(r);
        }
        System.out.println(r.getWinner());

    }
}