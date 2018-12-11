package lab18g_list_of_references_word;

public class Word {

    private String word;
    private static String vowels = "aeiou";   //only one

    public Word() {
        this.word = "";
    }

    public Word(String wrd) {
        this.word = wrd;
    }

    public void setWord(String wrd) {
        this.word = wrd;
    }

    public int getNumVowels() {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(Character.toLowerCase(c)) >= 0) {
                count++;
            }
        }
        return count;
    }

    public int getLength() {
        return word.length();
    }

    public String toString() {
        return word;
    }
}
