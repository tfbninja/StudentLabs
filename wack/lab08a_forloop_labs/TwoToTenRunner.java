package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class TwoToTenRunner {

    public static void main(String[] args) {
        String[] tests = {"1010", "1100", "1110", "1111", "11111", "111111", "1110101", "10101010101", "1010101010110", "111111111111111111"};
        TwoToTen tester = new TwoToTen();
        for (String i : tests) {
            tester.setTwo(i);
            System.out.println(tester);
        }
    }

}
