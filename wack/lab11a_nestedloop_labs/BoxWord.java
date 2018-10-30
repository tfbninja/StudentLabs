package lab11a_nestedloop_labs;
//Name -
//Date -
//Lab  -

class BoxWord {

    private String word;

    public BoxWord() {
        word = "";
    }

    public BoxWord(String s) {
        setWord(s);
    }

    public void setWord(String w) {
        this.word = w.toUpperCase();
    }

    public int getLen() {
        return this.word.length();
    }

    public String toString() {
        //Start with the word and a newline
        String output = this.word + "\n";

        // The chars making the sides of the box
        String middleChars = ""; // init

        // If our box is actually gonna have sides, init the side chars
        if (getLen() > 2) {
            middleChars = this.word.substring(1, getLen() - 1);
        }

        // Since the box is just a palindrome, make a StringBuilder to hold the other half
        StringBuilder output2 = new StringBuilder();

        /*
         * For half as many middle chars there are, do x
         * (Math.ceil because if the number of middle chars is odd, we still
         * want to do the last char)
         */
        for (int a = 0; a < Math.ceil(middleChars.length() / 2.0); a++) {
            // left side
            output += this.word.charAt(a + 1);
            //add spacing
            for (int b = 0; b < (getLen() - 2); b++) {
                output += " ";
            }
            // if even length word, add the other side and a newline
            //(if it's odd the other will be added when we mirror it)
            if (getLen() % 2 == 0) {
                output += this.word.charAt((getLen() - 2) - a) + "\n";
            }
        }

        // mirror our string
        for (char i : output.substring(0, output.length() - 1).toCharArray()) {
            /*
             * I feel like this is kinda lame, but I don't know how else to it
             * It's just that with the current setup, if the word is length 1,
             * then it does "x\nx" instead of "x". This removes that loophole.
             */
            if (getLen() > 1) {
                output2.insert(0, i);
            }
        }
        //add the first and the mirrored string together
        return output + output2.toString();
    }
}
