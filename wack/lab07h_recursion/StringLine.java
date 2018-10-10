/*
 * The goal of this lab is to use recursion to print a sentence backwards
 * Example:  
 *   Input:  It works!
 *   Output: !skrow tI
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class StringLine {

    public static void main(String[] args) {
        String str = "It works!";
        StringLine stringObj = new StringLine();
        stringObj.printString(str);

    }

    public void printString(String word) {

        int len = word.length();
        /*
        int halfpoint;
        if (word.length() <= 1){
            return word;            
        }
        if (len % 2 == 0){
            halfpoint = len / 2;
        } else {
            halfpoint = (len - 1) / 2;
        }
         */
        String temp = String.valueOf(word.charAt(len-1));
        if (len >= 2) {
            temp += printString(word.substring(len - 2));
        } else {
            String temp = word;
        }
        System.out.print(temp);
    }
}
