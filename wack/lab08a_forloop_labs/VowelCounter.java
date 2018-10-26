package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public class VowelCounter {

    public static String getNumberString(String s) {
        String builder = "";
        int num = 0;
        for (char i : s.toCharArray()) {
            i = Character.toLowerCase(i);
            if (num > 9){
                num = 0;
            }
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                builder += num;
                num++;
            } else {
                builder += i;
            }
        }
        return builder;
    }
}
