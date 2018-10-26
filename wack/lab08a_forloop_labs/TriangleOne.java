package lab08a_forloop_labs;
//Name -
//Date -
//Class -
//Lab  -

public class TriangleOne {

    private String word;

    public TriangleOne() {
        word = "";
    }

    public TriangleOne(String s) {
        this.word = s;
    }

    public void setWord(String s) {
        this.word = s;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = this.word.length(); i > 0; i--) {
            output.append(this.word.substring(0, i));
            output.append("\n");
        }
        return output.toString();
    }
}
