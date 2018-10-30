package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class BoxWordRunner {

    public static void main(String args[]) {
        String[] tests = {"SQUARE", "BOX", "A", "IT", "TOAD", "MCHAMMERGOHAMMER", "YaYeet"};
        BoxWord tester = new BoxWord();
        for (String test : tests) {
            tester.setWord(test);
            System.out.println(tester + "\n");
        }
    }
}
