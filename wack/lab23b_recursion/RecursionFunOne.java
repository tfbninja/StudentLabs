package lab23b_recursion;

public class RecursionFunOne {

    public static int countOddDigits(int num) {
        if (num <= 9) {
            return num % 2;
        }
        return countOddDigits(num / 10) + num % 2;
    }
}
