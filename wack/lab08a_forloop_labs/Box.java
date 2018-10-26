package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class Box {

    private String word;

    public Box() {
        word = "";
    }

    public Box(String s) {
        word = s;
    }

    public void setWord(String s) {
        word = s;
    }

    public String print() {
        String output = "";
        for (int i = 0; i < this.word.length(); i++) {
            output += this.word + "\n";
        }
        return output;
    }
}
