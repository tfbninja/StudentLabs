package lab24a_sortsearch_string;

public class StringSearchRunner {

    public static void main(String args[]) {
        System.out.println(StringSearch.countLetters("computerscience", "t"));
        System.out.println(StringSearch.countWords("computerscience", "to"));
        System.out.println(StringSearch.countWords("onetwoonetwofun", "n"));
        System.out.println(StringSearch.countWords("onefredonetwodog", "one"));
        System.out.println(StringSearch.countLetters("odogdogdogdogo", "o"));
        System.out.println(StringSearch.countWords("niininininininininini", "ni"));
    }
}
