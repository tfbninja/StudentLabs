package lab24d_sortsearch_findmaxprime;

public class MatrixSearch2Runner {

    public static void main(String[] args) throws Exception {
        //primeTester();
        int[][] tests = {{20, 15, 50}, {15, 15, 75}, {7, 7, 100}};
        for (int[] s : tests) {
            MatrixSearch2 m = new MatrixSearch2(s[0], s[1], s[2]);
            System.out.println(m + "\n");
        }
    }

    public static void primeTester() {
        int[] tests = new int[100];
        for (int i = 1; i < tests.length; i++) {
            tests[i - 1] = i;
        }
        for (int i : tests) {
            System.out.println(i + " " + new MatrixSearch2(1, 2, 3).isPrime(i));
        }

    }
}
