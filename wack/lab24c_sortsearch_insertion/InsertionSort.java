package lab24c_sortsearch_insertion;

import java.util.ArrayList;

class InsertionSort {

    private ArrayList<String> list;

    public InsertionSort() {
        list = new ArrayList<>();
    }

    public void add(String word) {
        if (list.isEmpty()) {
            list.add(word);
            return;
        }
        list.add(findInsertLocation(word), word);
    }

    private int findInsertLocation(String word) {
        int index = 0;
        for (String s : list) {
            if (word.compareTo(s) <= 0) {
                return index;
            }
            index++;
        }
        return index;
    }

    public void remove(String word) {
        list.remove(word);
    }

    public String toString() {
        return list.toString();
    }
}
