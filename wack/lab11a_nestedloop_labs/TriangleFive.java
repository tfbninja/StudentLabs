package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
public class TriangleFive {

    private char letter;
    private int amount;

    public TriangleFive() {
        this.letter = '-';
        this.amount = 0;
    }

    public TriangleFive(char c, int amt) {
        this.letter = c;
        this.amount = amt;
    }

    public void setLetter(char c) {
        this.letter = c;
    }

    public void setAmount(int amt) {
        this.amount = amt;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < this.amount; i++) {
            for (int count = this.amount; count > i; count--) {
                for (int square = 0; square < count; square++) {
                    output += (char) (((this.letter + (this.amount - count)) % 26) + 65);
                }
                output += " ";
            }
            output += "\n";
        }
        return output;
    }
}
