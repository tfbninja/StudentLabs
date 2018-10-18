package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class TenToAny {

    private int base10;
    private int newBase;
    private String newNum;

    public TenToAny() {
        base10 = 0;
        newBase = 0;
    }

    public TenToAny(int num, int base) {
        this.base10 = num;
        this.newBase = base;
    }

    public void setNum(int num) {
        this.base10 = num;
    }

    public void setBase(int base) {
        this.newBase = base;
    }

    public void set(int num, int base) {
        this.base10 = num;
        this.newBase = base;
    }

    public String getNewNum() {
        String newNum = "";
        int temp = this.base10;
        while (temp > 0) {
            newNum += temp % this.newBase;
            temp /= this.newBase;
        }
        this.newNum = revStr(tryBase16(newNum));
        return this.newNum;

    }

    public String revStr(String str) {
        String temp = "";
        while (str.length() > 0) {
            temp = str.charAt(0) + temp;
            str = str.substring(1);
        }
        return temp;
    }

    public String tryBase16(String num) {
        String temp = "";
        String builder = "";
        for (int i = 0; i < num.length(); i++) {
            temp += num.charAt(i);
            builder += num.charAt(i);
            if (temp.length() == 2 && Integer.valueOf(temp) > 9 && Integer.valueOf(temp) <= this.newBase) {
                builder = builder.substring(0, builder.length() - 2);
                builder += (char) (Integer.valueOf(temp) + 55);
                temp = "";
            }

        }
        return builder;
    }
    //add a toString method	

    @Override
    public String toString() {
        getNewNum();
        return this.base10 + " base 10 is " + this.newNum + " in base " + this.newBase;
    }
}
