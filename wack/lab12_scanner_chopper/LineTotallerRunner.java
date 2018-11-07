package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class LineTotallerRunner {

    public static void main(String args[]) {
        LineTotaller tester = new LineTotaller();
        String[] tests = {"1 2 3 4 5 6", "10 20 30 40 50 60", "250 657 2154 345 6796", "0", "-99 45 -98 92 87"};

        for (String test : tests){
            System.out.println(test);
            tester.setLine(test);
            System.out.println(tester + "\n");
        }
    }
}