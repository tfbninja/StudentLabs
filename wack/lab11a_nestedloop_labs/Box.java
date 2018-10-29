package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

public class Box {

    private int size;

    public Box() {
        this.size = 0;
    }

    public Box(int count) {
        this.size = count;
    }

    public void setSize(int count) {
        this.size = count;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        String output = "";
        for (int a = 1; a <= this.size; a++) {
            for (int b = this.size - a + 1; b >= 1; b--) {
                output += "*";
            }
            for (int c = 1; c <= a; c++) {
                output += "#";
            }
            output += "\n";
        }
        return output;
    }
}
