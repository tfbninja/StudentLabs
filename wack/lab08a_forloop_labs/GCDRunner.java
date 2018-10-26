package lab08a_forloop_labs;

public class GCDRunner {

    public static void main(String[] args) {
        int[] tests = {5, 25, 4, 400, 8, 80, 15, 45, 6, 66, 9, 9, 3, 543};
        GCD tester = new GCD();
        for (int i = 0; i < tests.length; i += 2) {
            tester.setNums(tests[i], tests[i + 1]);
            System.out.println(tester);
        }
    }
}
