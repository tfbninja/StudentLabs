package lab18g_list_of_references_word;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    private ArrayList<Word> words;

    public Words() {
        setWords("");
    }

    public Words(String wordList) {
        words = new ArrayList<>();
        Scanner chop = new Scanner(wordList);
        while (chop.hasNext()) {
            words.add(new Word(chop.next()));
        }
    }

    public void setWords(String wordList) {
        words = new ArrayList<>();
        Scanner chop = new Scanner(wordList);
        while (chop.hasNext()) {
            words.add(new Word(chop.next()));
        }
    }

    public int countWordsWithXChars(int size) {
        int count = 0;
        for (Word w : words) {
            if (w.getLength() == size) {
                count++;
            }
        }
        return count;
    }

    //this method will remove all words with a specified size / length
    //this method will also return the sum of the vowels in all words removed
    public int removeWordsWithXChars(int size) {
        int vowelSum = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getLength() == size) {
                vowelSum += words.remove(i).getNumVowels();
                i--;
            }
        }
        return vowelSum;
    }

    public int countWordsWithXVowels(int numVowels) {
        int count = 0;
        for (Word w : words) {
            if (w.getNumVowels() == numVowels) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        return words.toString();
    }
}
