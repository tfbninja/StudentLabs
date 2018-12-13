package lab19b_interfaces_Monster_lab2_java_aplus;

public class Monster implements Comparable {

    private int myWeight;
    private int myHeight;
    private int myAge;

    //write a default Constructor
    //write an initialization constructor with an int parameter ht
    //write an initialization constructor with int parameters ht and wt
    //write an initialization constructor with int parameters ht, wt, and age
    //modifiers - write set methods for height, weight, and age
    //accessors - write get methods for height, weight, and age
    //creates a new copy of this Object
    public Object clone() {
        return new Monster();
    }

    public boolean equals(Object obj) {

        return false;
    }

    public int compareTo(Object obj) {
        Monster rhs = (Monster) obj;

        return -1;
    }

    @Override
    public String toString() {
        return "";
    }
}
