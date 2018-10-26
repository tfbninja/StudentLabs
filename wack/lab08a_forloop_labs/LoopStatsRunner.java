package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class LoopStatsRunner {

    public static void main(String[] args) {
        LoopStats tester = new LoopStats();
        int[] tests = {1, 5, 2, 8, 5, 15};
        for (int i = 0; i < tests.length; i += 2) {
            tester.setNums(tests[i], tests[i + 1]);
            System.out.println(tester + "\n");
        }
    }
}
