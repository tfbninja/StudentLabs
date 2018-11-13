package lab14a_array_labs;

import java.util.Scanner;

public class OddsAndEvens {

    private static int countEm(int[] array, boolean odd) {
        int count = 0;
        for (int i : array) {
            if (Math.abs(i % 2) == 1 && odd) {
                count++;
            } else if (Math.abs(i % 2) == 0 && !odd) {
                count++;
            }
        }
        return count;
    }

    public static int[] getAllEvens(int[] array) {
        int[] evens = new int[countEm(array, false)];

        int index = 0;
        for (int i : array) {
            if (Math.abs(i % 2) == 0) {
                evens[index] = i;
                index++;
            }
        }
        return evens;
    }

    public static int[] getAllOdds(int[] array) {
        int[] odds = new int[countEm(array, true)];
        int index = 0;
        for (int i : array) {
            if (Math.abs(i % 2) == 1) {
                odds[index] = i;
                index++;
            }
        }
        return odds;
    }

    public static int[] parseString(String array) {
        int size = 0;
        Scanner str = new Scanner(array);
        while (str.hasNext()) {
            size++;
            str.next();
        }
        Scanner token = new Scanner(array);
        int[] newA = new int[size];
        int index = 0;
        while (token.hasNextInt()) {
            newA[index] = token.nextInt();
            index++;
        }
        return newA;
    }
}
