/*
 * The goal of this lab is to use recursion to print an integer number backwards
 * Example:  
 *   Input:  752
 *   Output: 257
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class ReverseInt {

    public static void main(String[] args) {
        int number = 98989898;
        ReverseInt revIntObj = new ReverseInt();
        System.out.println(revIntObj.revDigs(String.valueOf(number)));
    }

    public String revDigs(String num) {
        int halfpoint;
        if (num.length() % 2 == 0){
            halfpoint = num.length() / 2; // 0 indexed
        } else {
            halfpoint = (num.length()-1) / 2; // 0 indexed
        }
        if (num.length() <= 1){
            return num;
        }
        return revDigs(num.substring(halfpoint)) + revDigs(num.substring(0, halfpoint));
    }
}
