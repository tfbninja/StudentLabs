package lab24f_sortsearch_wordlength;

public class Word implements Comparable<Word> {

    private String word;

    public Word() {
        word = "";
    }

    public Word(String s) {
        word = s;
    }

    @Override
    public int compareTo(Word o) {
        return word.length() - o.word.length();
    }

    @Override
    public String toString() {
        return word;
    }
}
