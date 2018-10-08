package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class WordFunRunner {

    public static void main(String args[]) {
        dewIt("Hello World");
        dewIt("Jim Bob");
        dewIt("Computer Science");
        dewIt("UIL TCEA");
        dewIt("State Champions");

    }

    public static void dewIt(String wd) {
        WordFun test = new WordFun("Hello World");
        test.setWord(wd);
        System.out.println(test + "\n\n");
        test.makeUpper();
        System.out.println(test + "\n\n");
        test.addHyphen();
        System.out.println(test + "\n\n");
    }
}
