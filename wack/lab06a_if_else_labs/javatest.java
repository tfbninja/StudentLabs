package lab06a_if_else_labs;
import java.util.regex.Pattern;

public class javatest {

    public static void main(String args[]) {
        String str = "456-12-345";
        int sum = Pattern.compile("-").splitAsStream(str).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
