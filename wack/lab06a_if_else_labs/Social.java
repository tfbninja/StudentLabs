package lab06a_if_else_labs;

import java.util.regex.Pattern;

public class Social {

    private String socialNum;
    private int sum;

    public Social() {
        socialNum = "";
    }

    public Social(String soc) {
        socialNum = soc;
    }

    public void setWord(String w) {
        socialNum = w;
    }

    public int chopAndAdd() {
        return sum = Pattern.compile("-").splitAsStream(socialNum).mapToInt(Integer::parseInt).sum();
    }

    public String toString() {
        return "SS# " + socialNum + " has a total of " + chopAndAdd() + "\n";
    }
}
