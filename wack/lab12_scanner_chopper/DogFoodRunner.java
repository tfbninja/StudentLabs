package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class DogFoodRunner {

    public static void main(String[] args) {
        String[] tests = {"6 10 14 18 25 32", "12 15 20 26 35 42", "33 38 45 51 60 65", "40 50 60 77 90 101"};
        DogFood tester = new DogFood();

        for (String test : tests) {
            tester.setLine(test);
            System.out.println(tester.getAmount());
            System.out.println(tester + "\n");
        }
    }
}
