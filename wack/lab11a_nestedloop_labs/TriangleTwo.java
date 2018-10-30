package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class TriangleTwo {

    private int size;
    private String letter;

    public TriangleTwo() {
        this.size = 0;
        this.letter = "";
    }

    public TriangleTwo(String let, int sz) {
        this.letter = let;
        this.size = sz;
    }

    public void setTriangle(int count, String let) {
        this.size = count;
        this.letter = let;
    }

    public String getLetter() {
        return this.letter;
    }

    public String toString() {
        String output = "";

        for (int a = 0; a < this.size; a++) {
            for (int b = this.size - a; b > 0; b--) {
                output += this.letter;
            }
            output += "\n";
        }
        return output + "\n";
    }
}
