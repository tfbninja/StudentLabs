package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name {

    private String name;
    private int space;

    public Name() {
        name = "-1";
        space = -1;
    }

    public Name(String s) {
        name = s;
        space = name.indexOf(" ");
    }

    public void setName(String s) {
        name = s;
        space = name.indexOf(" ");
    }

    public String getFirst() {
        return name.substring(0,space);
    }

    public String getLast() {
        return name.substring(space+1);
    }

    public String toString() {
        return name;
    }
}