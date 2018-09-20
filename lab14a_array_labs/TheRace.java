package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class TheRace {

    private int one;
    private int two;
    private int oneCount;
    private int twoCount;
    private int[] track;
    private int turn;
    private int winner;

    public TheRace() {
    }

    public boolean turn() {
        return false;
    }

    public String getWinner() {
        return "";
    }

    public String toString() {
        return Arrays.toString(track) + " one count = " + oneCount + " twoCount = " + twoCount;
    }
}