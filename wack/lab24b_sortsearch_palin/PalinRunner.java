package lab24b_sortsearch_palin;

public class PalinRunner {

    public static void main(String args[]) {
        String[] words = "dog dad racecar goofy madam alligator benjamin".split(" ");
        for (String s : words) {
            Palin one = new Palin(s);
            System.out.println(one);
        }
    }
}
