package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class TriplesRunner {

    public static void main(String args[]) {
        int[] tests = {110};
        Triples tester = new Triples();
        for (int test : tests) {
            tester.setNum(test);
            System.out.println("Triples up to " + test + "\n" + tester);
        }
    }
}
