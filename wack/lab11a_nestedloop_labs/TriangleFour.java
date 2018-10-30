package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class TriangleFour {

    private int size;
    private String letter;

    public TriangleFour() {
        this.size = 0;
        this.letter = "";
    }

    public TriangleFour(int count, String let) {
        this.size = count;
        this.letter = let;
    }

    public void setTriangle(String let, int sz) {
        this.size = sz;
        this.letter = let;
    }

    public String getLetter() {
        return this.letter;
    }

    public String toString() {
        String output = "";
        for (int iteration = 0; iteration < this.size; iteration++) {
            for (int spaces = 0; spaces < iteration; spaces++) {
                output += " ";
            }
            for (int chars = this.size - iteration; chars > 0; chars--) {
                output += this.letter;
            }
            output += "\n";
        }
        return output + "\n";
    }
}
