package lab24b_sortsearch_palin;

public class LongPalindromeRunner {

    public static void main(String args[]) {
        String[] tests = "bobcat bobracecarcat alligatorslikegroovycatslikemadamandrooroo idrovetothelibraryinmyracecartolearnaboutpanama".split(" ");
        for (String s : tests) {
            System.out.println(LongPalindrome.getAllPalins(s));
            System.out.println(LongPalindrome.getLongestPalin(s).getWord());
        }
    }
}
