package lab18h_list_of_references_toys;

import java.util.ArrayList;

public class ToyStore {

    private ArrayList<Toy> toyList;

    public ToyStore() {
        toyList = new ArrayList<>();
    }

    public void loadToys(String toys) {
        Scanner chop = new Scanner(toys);
        while (chop.hasNext()) {
            toyList.add(new Toy(chop.next()));
        }
    }

    public Toy getThatToy(String nm) {
        for (Toy t : toyList) {
            if (t.getName().equals(nm)) {
                return t;
            }
        }
        return null;
    }

    public String getMostFrequentToy() {
        int highest = toyList.get(0).getCount();
        for (Toy t : toyList) {
            if (t.getCount() > highest) {
                return t.getName();
            }
        }
        return "";
    }

    public void sortToysByCount() {
    }

    public String toString() {
        return "";
    }
}
