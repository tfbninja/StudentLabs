package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class LetterRemoverRunner {

    public static void main(String args[]) {
        //add test cases
        String[] testStrings = {"I am Sam I am", "ssssssssxssssesssssesss", "qwertyqwertyqwerty", "abababababa","abaababababa"};
        char[] testChars = {'a', 's', 'a', 'b', 'x'};
        LetterRemover tester = new LetterRemover(" ", ' ');
        int index = 0;
        for (String i : testStrings){
            tester.setRemover(i, testChars[index]);
            tester.removeLetters();
            System.out.println(tester);
            index++;
        }
    }
}