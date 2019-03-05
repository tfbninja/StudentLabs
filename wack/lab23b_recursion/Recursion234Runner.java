package lab23b_recursion;

public class Recursion234Runner {

    public static void main(String args[]) {
        int[] lab2TestCases = {4532, 1114532, 2245327, 2468, 13579};
        int[] answers2 = {2, 5, 3, 0, 5};
        for (int index = 0; index < answers2.length; index++) {
            System.out.println("Odd digit count should be " + answers2[index] + " and is " + RecursionFunOne.countOddDigits(lab2TestCases[index]));
        }
        int[] answers3 = {0, 1, 3, 0, 2};
        String[] lab3TestCases = {"itatfun", "itatchickenfun", "chchickchickenenicken", "chickchickfun", "chickenbouncetheballchicken"};
        for (int index = 0; index < answers2.length; index++) {
            System.out.println("Chicken count should be " + answers3[index] + " and is " + RecursionFunTwo.countChickens(lab3TestCases[index]));
        }

        int[] answers4 = {1, 14, 2, 15, 28, 32, 0};
        long[] lab4TestCases = {7, 77, 1087171, 1077171, 77077, 97171771707797L, 1089651234};
        for (int index = 0; index < answers2.length; index++) {
            System.out.println("Seven count should be " + answers4[index] + " and is " + RecursionFunThree.luckySevens(lab4TestCases[index]));
        }
        //add more test cases
    }
}
