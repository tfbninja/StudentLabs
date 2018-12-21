package lab18c_array_of_refs_MonsterMash_lab_java_aplus;

import lab19b_interfaces_Monster_lab2_java_aplus.Monster;
import java.util.*;

public class Monsters {

    private ArrayList<Monster> monsters;

    public Monsters(int size) {
        monsters = new ArrayList<>();
    }

    public void set(int spot, Monster m) {
        monsters.set(spot, m);
    }

    public void add(Monster m) {
        monsters.add(m);
    }

    public void remove(Monster m) {
        monsters.remove(m);
    }

    public Monster getLargest() {
        Monster largest = monsters.get(0);
        for (Monster m : monsters) {
            if (m.getSize() > largest.getSize()) {
                largest = m;
            }
        }
        return largest;
    }

    public Monster getSmallest() {
        Monster smallest = monsters.get(0);
        for (Monster m : monsters) {
            if (m.getSize() < smallest.getSize()) {
                smallest = m;
            }
        }
        return smallest;
    }

    @Override
    public String toString() {
        String output = "[";
        for (Monster m : monsters) {
            output += m.toString() + ", ";
        }
        output = output.substring(0, output.length() - 2);
        output += "]";
        return output;
    }
}
