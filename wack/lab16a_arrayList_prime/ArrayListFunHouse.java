package lab16a_arrayList_prime;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse {

    public static ArrayList<Integer> getListOfFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int a = 0; a <= (int) Math.sqrt((double) number); a++) {
            for (int b = 0; b < number; b++) {
                if (a * b == number && !factors.contains(a) && !factors.contains(b)) {
                    factors.add(a);
                    factors.add(b);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }

    public static void keepOnlyCompositeNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (getListOfFactors(nums.get(i)).size() > 2) {
                nums.remove(i);
                i--;
            }
        }
    }
}
