package lab18f_list_of_references_number;

import java.util.*;

public class NumberAnalyzer {

    private ArrayList<Number> list;

    public NumberAnalyzer() {
        list = new ArrayList<>();
    }

    public NumberAnalyzer(String numbers) {
        list = new ArrayList<>();
        Scanner chop = new Scanner(numbers);
        while (chop.hasNextInt()) {
            list.add(new Number(chop.nextInt()));
        }
    }

    public void setList(String numbers) {
        list = new ArrayList<>();
        Scanner chop = new Scanner(numbers);
        while (chop.hasNextInt()) {
            list.add(new Number(chop.nextInt()));
        }
    }

    public int countOdds() {
        int oddCount = 0;
        for (Number n : list) {
            if (n.isOdd()) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public int countEvens() {
        int evenCount = 0;
        for (Number n : list) {
            if (n.isEven()) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public int countPerfects() {
        int perfectCount = 0;
        for (Number n : list) {
            if (n.isPerfect()) {
                perfectCount++;
            }
        }
        return perfectCount;
    }

    public String toString() {
        return list.toString();
    }
}
