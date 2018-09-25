package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class NameRunner {

    public static void main(String[] args) {
        Name person = new Name("Sally Baker");
        System.out.println(person.getFirst());
        System.out.println(person.getLast());
        System.out.println(person + "\n\n");

        person.setName("John Doe");
        System.out.println(person.getFirst());
        System.out.println(person.getLast());
        System.out.println(person + "\n\n");

        person.setName("Sammy Lammy");
        System.out.println(person.getFirst());
        System.out.println(person.getLast());
        System.out.println(person + "\n\n");

        person.setName("Benny Programmer");
        System.out.println(person.getFirst());
        System.out.println(person.getLast());
        System.out.println(person + "\n\n");

        person.setName("Sandy Painter");
        System.out.println(person.getFirst());
        System.out.println(person.getLast());
        System.out.println(person + "\n\n");
    }
}