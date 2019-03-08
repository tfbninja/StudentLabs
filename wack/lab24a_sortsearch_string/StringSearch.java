package lab24a_sortsearch_string;

public class StringSearch {

    /*
     * method countWords will count the occurrences of word in sent
     * there may many occurrences of word or none at all
     */
    public static int countWords(String sent, String word) {
        int count = 0;
        while (sent.contains(word)) {
            count++;
            sent = sent.substring(0, sent.indexOf(word)) + sent.substring(sent.indexOf(word) + word.length());
        }
        return count;
    }

    /*
     * method countLetters will count the occurrences of letter in sent
     * there may many occurrences of letter or none at all
     */
    public static int countLetters(String sent, String letter) {
        return countWords(sent, letter);
    }
}
