package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class PrimeRunner {

    public static void main(String[] args) {
        int[] tests = {24, 7, 100, 113, 65535, 2, 7334, 7919, 1115125003};
        Prime tester = new Prime();
        for (int i : tests) {
            tester.setPrime(i);
            System.out.println(tester + "\n");
        }
    }
}
