package lab18g_list_of_references_word;

public class WordRunner {

    public static void main(String[] args) {
        Word ch = new Word("chicken");
        System.out.println(ch);
        System.out.println("Num vowels == " + ch.getNumVowels());
        System.out.println("Num chars == " + ch.getLength());

        System.out.println("");
        Word al = new Word("alligator");
        System.out.println(al);
        System.out.println("Num vowels == " + al.getNumVowels());
        System.out.println("Num chars == " + al.getLength());

        System.out.println("");
        Word el = new Word("elephant");
        System.out.println(el);
        System.out.println("Num vowels == " + el.getNumVowels());
        System.out.println("Num chars == " + el.getLength());
    }
}
