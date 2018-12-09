package lab18d_array_of_refs_Doggies_lab_java_aplus;

import java.util.*;

public class Pack {

    private ArrayList<Dog> pups;

    public Pack(int size) {
        pups = new ArrayList<>();
    }

    public void add(Dog doge) {
        pups.add(doge);
    }

    public void add(int age, String name) {
        pups.add(new Dog(age, name));
    }

    public void set(int age, String name, int index) {
        pups.set(index, new Dog(age, name));
    }

    public void set(Dog doge, int index) {
        pups.set(index, doge);
    }

    public String getNameOfOldest() {
        Dog oldest = pups.get(0);
        for (Dog d : pups) {
            if (d.getAge() > oldest.getAge()) {
                oldest = d;
            } else if (d.getAge() == oldest.getAge()) {
                if (d.getName().compareTo(oldest.getName()) < 0) {
                    // if ages are the same, the oldest is the one with the alphabetically first name
                    oldest = d;
                }
            }
        }
        return oldest.getName();
    }

    public String getNameOfYoungest() {
        Dog youngest = pups.get(0);
        for (Dog d : pups) {
            if (d.getAge() < youngest.getAge()) {
                youngest = d;
            } else if (d.getAge() == youngest.getAge()) {
                if (d.getName().compareTo(youngest.getName()) < 0) {
                    // if ages are the same, the youngest is the one with the alphabetically first name
                    youngest = d;
                }
            }
        }
        return youngest.getName();
    }

    @Override
    public String toString() {
        String output = "[";
        for (Dog d : pups) {
            output += d.toString() + ", ";
        }
        output = output.substring(0, output.length() - 2);
        output += "]";
        return output;
    }
}
