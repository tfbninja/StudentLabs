package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Date -
//Class -
//Lab  -
public class TwoToTen {

    private String binary;

    public TwoToTen() {
        this.binary = "";
    }

    public TwoToTen(String bin) {
        this.binary = bin;
    }

    public void setTwo(String bin) {
        this.binary = bin;
    }

    public long getBaseTen() {
        long ten = 0;
        for (char i : this.binary.toCharArray()) {
            /*
             * THIS TOOK ME SO LONG TO FIGURE OUT!
             * I was originally doing 'ten += Integer.valueOf(i);'
             * and working with that, and I couldn't understand why I was
             * getting ridiculously large numbers, I even tried 'sout(i);'
             * but it seemed to be normal. I figured I must be doing something
             * wrong in my algorithm. I tried at least 20 different ways of
             * doing it, most of which probably wouldn't work anyway, but they
             * were all off. Then I tried 'sout(Integer.valueOf(i));', and
             * instantly realized my problem: I was working with the ascii value
             * of 1 and 0, 49 and 48.
             * *face-palm*
             */
            ten *= 2;
            ten += Integer.valueOf(i) - 48;
        }
        return ten;
    }

    public String toString() {
        return this.binary + " == " + getBaseTen();
    }
}
