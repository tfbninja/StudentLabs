package lab24b_sortsearch_palin;

public class Palin {

    private String s;

    public Palin(String t) {
        s = t;
    }

    public void setWord(String t) {
        s = t;
    }

    public int getLength() {
        return s.length();
    }

    public String getWord() {
        return s;
    }

    public boolean isPalin() {
        for (int i = 0; i < getLength() / 2; i++) {
            if (s.charAt(i) != s.charAt(getLength() - (1 + i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return s + " is " + (isPalin() ? "" : "not ") + "a palindrome";
    }
}
