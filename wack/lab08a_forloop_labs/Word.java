package lab08a_forloop_labs;

public class Word {

    private String word;

    public Word() {
        this.word = "";
    }

    public Word(String s) {
        this.word = s;
    }

    public void setString(String s) {
        this.word = s;
    }

    public char getFirstChar() {
        return this.word.charAt(0);
    }

    public char getLastChar() {
        return this.word.charAt(this.word.length() - 1);
    }

    public String getBackWards() {
        StringBuilder back = new StringBuilder(this.word);
        return back.reverse().toString();
    }

    @Override
    public String toString() {
        return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + this.word;
    }
}
