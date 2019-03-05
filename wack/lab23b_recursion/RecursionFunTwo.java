package lab23b_recursion;

import static java.lang.System.*;

public class RecursionFunTwo {

    public static int countChickens(String word) {
        if (word.length() <= 7) {
            return word.toLowerCase().equals("chicken") ? 1 : 0;
        }
        if (word.toLowerCase().contains("chicken")) {
            return 1 + countChickens(word.substring(word.indexOf("chicken"), word.indexOf("chicken") + 7));
        } else {
            return 0;
        }       
    }
}
