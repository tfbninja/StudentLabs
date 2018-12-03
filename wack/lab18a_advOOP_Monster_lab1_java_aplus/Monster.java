package lab18a_advOOP_Monster_lab1_java_aplus;

public class Monster {

    private String name;
    private int size;

    public Monster() {
        this.name = "";
        this.size = 0;
    }

    public Monster(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int size() {
        return this.size;
    }

    public boolean isBiggerThan(Monster other) {
        return this.size > other.size();
    }

    public boolean isSmallerThan(Monster other) {
        // the hint said to invert isBigger(), but after a simple test, that is WRONG
        // isBiggerThan() equates to size > other. Therefore negating that gives
        // other >= size, which is not what we want. We need to make the method
        // manually, rather than inverting another method
        // return !isBiggerThan(other);
        return this.size
    }

    public boolean namesTheSame(Monster other) {
        return this.name.equals(other.getName());
    }

    public String toString() {
        return this.name + ", size " + this.size();
    }
}
