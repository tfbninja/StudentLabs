package lab18h_list_of_references_toys;

import java.util.*;

public class ToyStore {

    private ArrayList<Toy> toyList;

    public ToyStore() {
        toyList = new ArrayList<>();
    }

    public void loadToys(String toys) {
        Scanner chop = new Scanner(toys);
        while (chop.hasNext()) {
            String tempName = chop.next();
            boolean happened = false;
            for (Toy t : toyList) {
                if (tempName.equals(t.getName())) {
                    t.increment();
                    happened = true;
                }
            }
            if (!happened) {
                toyList.add(new Toy(tempName));
            }
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
        return toyList.get(0).getName();
    }

    public void sortToysByCount() {
        Collections.sort(toyList);
    }

    public String toString() {
        return toyList.toString();
    }
}
