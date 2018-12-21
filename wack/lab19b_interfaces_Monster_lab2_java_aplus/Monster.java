package lab19b_interfaces_Monster_lab2_java_aplus;

public class Monster {

    private int size;
    private String name;
    private int height;
    private int age;

    public Monster() {
        this.size = 1;
        this.name = "Monster " + (int) Math.random() * 100000;
        this.height = 1;
        this.age = 0;
    }

    public Monster(int size, int height, int age) {
        this.size = size;
        this.name = "Monster " + (int) Math.random() * 100000;
        this.height = height;
        this.age = age;
    }

    public Monster(int size, String name, int height, int age) {
        this.size = size;
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public int getHeight() {
        return this.height;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int amt) {
        this.height = amt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int compareTo(Monster otherMonster) {
        if (this.size < otherMonster.getSize()) {
            return -1;
        } else if (this.size > otherMonster.getSize()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return getHeight() + " " + getSize() + " " + getAge();
    }

}
