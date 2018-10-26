package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class WordRunner {

    public static void main(String[] args) {
        String[] tests = {"Hello", "World", "JukeBox", "TCEA", "UIL"};
        Word tester = new Word();
        for (String test : tests) {
            tester.setString(test);
            System.out.println(tester + "\n");
        }
    }
}
