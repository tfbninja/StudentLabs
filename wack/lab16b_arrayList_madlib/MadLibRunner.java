package lab16b_arrayList_madlib;

import static java.lang.System.*;

public class MadLibRunner {

    public static void main(String args[]) {
        //make a new MadLib
        MadLib tester = new MadLib("story.dat");
        out.println(tester);
    }
}
