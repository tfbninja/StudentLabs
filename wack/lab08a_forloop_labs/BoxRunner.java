package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class BoxRunner {

    public static void main(String[] args) {
        Box tester = new Box();
        String[] tests = {"hippo", "abcd", "it", "a", "chicken"};
        for (String i : tests) {
            tester.setWord(i);
            System.out.println(tester.print());
        }
    }
}
