package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class LineCounterRunner {

    public static void main(String args[]) {
        LineCounter tester = new LineCounter();
        String[] tests = {"9 10 5 20 1 2 3", "11 22 33 44 55 66 77 5 6 7", "48 52 29 100 50 293 4", "0", "100 90 95 98 100 97"};

        for (String test : tests){
            tester.setLine(test);
            System.out.println(test);
            System.out.println(tester + "\n");
        }
    }
}
