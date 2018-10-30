package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class TriangleThree {

    private int size;
    private String letter;

    public TriangleThree() {
        this.size = 0;
        this.letter = "";
    }

    public TriangleThree(int count, String let) {
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
        for (int a = 1; a <= this.size; a++) {
            for (int b = this.size - a; b > 0; b--) {
                output += " ";
            }
            for (int c = 1; c <= a; c++) {
                output += this.letter;
            }
            output += "\n";
        }
        return output + "\n";
    }
}
