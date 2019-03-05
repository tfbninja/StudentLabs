package lab23b_recursion;

import static java.lang.System.*;

public class RecursionFunTwo {

    public static int countChickens(String word) {
        return word.toLowerCase().contains("chicken") ? 1 + countChickens(word.substring(0, word.indexOf("chicken")) + word.substring(word.indexOf("chicken") + 7)) : 0;
    }
}
