package lab23c_recursion_at_counter;

public class AtCounterRunner {

    public static void main(String args[]) {
        AtCounter tester = new AtCounter();
        int[][] testCases = {{0, 0}, {0, 9}, {9, 0}, {9, 9}, {}, {}, {}};
        for (int i = 0; i < 3; i++) {
            testCases[4 + i] = tester.getRandomAt();
        }

        System.out.println(tester);
        for (int[] test : testCases) {
            System.out.println(tester.countAts(test[0], test[1]) + " @s at (" + test[0] + ", " + test[1] + ")");
        }
    }
}
