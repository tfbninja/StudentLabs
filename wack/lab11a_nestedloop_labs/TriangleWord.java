package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

class TriangleWord {

    private String word;

    public TriangleWord() {
        word = "";
    }

    public TriangleWord(String w) {
        this.word = w;
    }

    public void setWord(String w) {
        this.word = w;
    }

    public String toString() {
        String output = "";
        int numSpaces = this.word.length() - 1;
        int midSpaces = 0;
        for (int iter = 0; iter < this.word.length() - 1; iter++) {
            for (int spaces = 0; spaces < numSpaces; spaces++) {
                output += " ";
            }
            if (midSpaces > 0) {
                output += this.word.substring(iter, iter + 1);
            } else {
                output += this.word.charAt(0);
            }
            for (int midSpacing = 0; midSpacing < (midSpaces * 2) - 1; midSpacing++) {
                output += " ";
            }
            if (midSpaces > 0) {
                output += this.word.substring(iter, iter + 1);
            }

            for (int midSpacing = 0; midSpacing < midSpaces; midSpacing++) {
                output += " ";
            }
            midSpaces++;
            numSpaces--;
            output += "\n";
        }
        StringBuilder output2 = new StringBuilder();
        output2.append(this.word);
        output2.reverse();
        output += output2.toString().substring(0, output2.length() - 1) + this.word;
        return output + "\n";
    }
}
