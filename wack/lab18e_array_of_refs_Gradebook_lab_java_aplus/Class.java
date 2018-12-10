package lab18e_array_of_refs_Gradebook_lab_java_aplus;

import java.util.*;

/*
 * Alright, why in the heck is there a class named class???
 * Who thought of that???
 *
 * OK, I'm done.
 *
 */
public class Class {

    private String name;
    private ArrayList<Student> roster = new ArrayList<Student>();

    public Class() {
        name = "Class " + (int) +Math.random() * 100000;
    }

    public Class(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        this.roster.add(s);
    }

    public String getClassName() {
        return this.name;
    }

    public double getClassAverage() {
        double classAverage = 0.0;

        return classAverage;
    }

    public double getStudentAverage(int stuNum) {
        return 0.0;
    }

    public double getStudentAverage(String stuName) {

        return 0.0;
    }

    public String getStudentName(int stuNum) {
        return "";
    }

    public String getStudentWithHighestAverage() {
        double high = Double.MIN_VALUE;
        String hName = "";

        return hName;
    }

    public String getStudentWithLowestAverage() {
        double low = Double.MAX_VALUE;
        String hName = "";

        return hName;
    }

    public String getFailureList(double failingGrade) {
        String output = "";

        return output;
    }

    public String toString() {
        String output = "" + getClassName() + "\n";

        return output;
    }
}
