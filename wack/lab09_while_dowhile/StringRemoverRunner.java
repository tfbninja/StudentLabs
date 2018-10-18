package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class StringRemoverRunner {

    public static void main(String args[]) {
        //add test cases
        String[] testStrings = {"xR-MxR-MHelloxR-M", "sxsssxssxsxssexssxsesss", "fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn"};
        String[] testRemovals = {"R-M", "xs", "qwerty"};
        int index = 0;
        StringRemover tester = new StringRemover("", "");
        for (String i : testStrings){
            tester.setRemover(i, testRemovals[index]);
            System.out.println(tester);
            index++;
        }
    }
}