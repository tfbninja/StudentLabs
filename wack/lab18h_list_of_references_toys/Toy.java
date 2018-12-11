package lab18h_list_of_references_toys;

public class Toy implements Comparable {

    private String name;
    private int count;

    public Toy() {
        this.name = "";
        this.count = 1;
    }

    public Toy(String nm) {
        this.name = nm;
        this.count = 1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int cnt) {
        this.count = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public int compareTo(Object other) {
        return getCount() - ((Toy) other).getCount();
    }

    public String toString() {
        return name + " " + count;
    }
}
