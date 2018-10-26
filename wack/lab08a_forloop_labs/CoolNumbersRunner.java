package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class CoolNumbersRunner {

    public static void main(String[] args) {
        int[] tests = {250, 1250, 2250, 5500, 9500, 23500, 32500};
        for (int j : tests) {
            System.out.println(CoolNumbers.countCoolNumbers(j) + " cool numbers between 6 - " + j);
        }

        //add more test cases
    }
}
