package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class ForLoopDemoRunner {

    public static void main(String[] args) {
        int[] tests = {2, 90, 5, 3, 76, 4, -10, 8, 2, 5, 30, 2, 100, 150, 5};
        for (int i = 0; i < tests.length; i += 3) {
            ForLoopDemo.runForLoop(tests[i], tests[i + 1], tests[i + 2]);
            System.out.println("");
        }

    }
}
