package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class LetterRemover {

    private String sentence;
    private char lookFor;

    public LetterRemover(String sent, char remove) {
        //call set
        setRemover(sent, remove);
    }

    //add in second constructor
    public void setRemover(String s, char rem) {
        sentence = s;
        lookFor = rem;
    }

    public String removeLetters() {
        String cleaned = sentence;
        while (cleaned.indexOf(lookFor) > -1) {
            int pos = cleaned.indexOf(lookFor);
            //System.out.println(pos); //debug
            cleaned = cleaned.substring(0, pos) + cleaned.substring(pos + 1);
        }
        return cleaned;
    }

    public String toString() {
        return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
    }
}
