package lab18h_list_of_references_toys;

public class ToyRunner {

    public static void main(String[] args) {
        Toy sorry = new Toy("sorry");
        Toy joe = new Toy("GI Joe");
        joe.setCount(5);
        System.out.println(sorry);
        System.out.println(joe);
    }
}
