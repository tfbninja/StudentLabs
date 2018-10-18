package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
class StringRemover {

    private String sentence;
    private String remove;

    public StringRemover() {
        sentence = "";
        remove = "";
    }

    public StringRemover(String sentence, String remove) {
        this.sentence = sentence;
        this.remove = remove;
    }

    public void setRemover(String s, String rem) {
        this.sentence = s;
        this.remove = rem;
    }

    public String removeStrings() {
        String cleaned = sentence;
        while (cleaned.indexOf(this.remove) > -1) {
            int pos = cleaned.indexOf(this.remove) - 1;
            cleaned = cleaned.substring(0, pos) + cleaned.substring(pos + this.remove.length() + 1);
        }
        return cleaned;
    }

    public String toString() {
        return this.sentence + " - String to remove " + this.remove + "\n" + this.removeStrings();
    }
}
