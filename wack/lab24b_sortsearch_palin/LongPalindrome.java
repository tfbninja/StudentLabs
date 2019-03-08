package lab24b_sortsearch_palin;

import java.util.ArrayList;

public class LongPalindrome {

    private static Palin p = new Palin("");

    /*
     * method getAllPalins will return an array list that contains
     * all of the palindromes contained within word
     * palindromes must have a minimum length of 2
     */
    public static ArrayList<Palin> getAllPalins(String word) {
        ArrayList<Palin> palins = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (int sz = 2; sz < word.length() - (i + 2); sz++) {
                String temp = word.substring(i, i + sz);
                p.setWord(temp);
                if (p.isPalin()) {
                    palins.add(new Palin(temp));
                }
            }
        }
        return palins;
    }

    /*
     * method insertLocation will look at the list and determine where to
     * put the new Palin so that the sorted order is maintained
     */
    private static int insertLocation(ArrayList<Palin> list, Palin pal) {
        return 0;
    }

    /*
     * method getLongestPalin will return the longest
     * palindrome contained within word
     * a palindrome must a minimum length of 2
     */
    public static Palin getLongestPalin(String word) {
        ArrayList<Palin> all = getAllPalins(word);
        String max = all.get(0).getWord();
        for (Palin p : all) {
            if (p.getWord().length() > max.length()) {
                max = p.getWord();
            }
        }
        return new Palin(max);
    }
}
