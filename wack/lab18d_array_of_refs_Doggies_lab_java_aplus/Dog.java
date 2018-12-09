package lab18d_array_of_refs_Doggies_lab_java_aplus;

public class Dog {

    private int age;
    private String name;

    public Dog() {
        this.age = 1;
        this.name = "Dog " + (int) Math.random() * 100000;
    }

    public Dog(int a, String n) {
        age = a;
        name = n;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return age + " " + name;
    }
}
