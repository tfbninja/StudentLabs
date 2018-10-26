package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class FactorialRunner {

    public static void main(String[] args) {
        int[] tests = {5, 4, 8, 15, 6, 9, 3};
        Factorial tester = new Factorial();
        for (int i : tests) {
            tester.setNum(i);
            System.out.println(tester);
        }
    }
}
