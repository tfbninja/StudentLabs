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
        return !isBiggerThan(other);
    }

    public boolean namesTheSame(Monster other) {
        return this.name.equals(other.getName());
    }

    public String toString() {
        return this.name + ", size " + this.size();
    }
}
