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
        name = "Class " + (int) (Math.random() * 100000);
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
        for (Student s : roster) {
            classAverage += s.getAverage();
        }
        classAverage /= roster.size();

        return classAverage;
    }

    public double getStudentAverage(int stuNum) {
        return roster.get(stuNum).getAverage();
    }

    public double getStudentAverage(String stuName) {
        int studentIndex = -1;
        for (Student s : roster) {
            if (s.getName().equals(stuName)) {
                studentIndex = roster.indexOf(s);
            }
        }
        if (studentIndex == -1) {
            return 0.0;
        }
        return roster.get(studentIndex).getAverage();
    }

    public String getStudentName(int stuNum) {
        return roster.get(stuNum).getName();
    }

    public String getStudentWithHighestAverage() {
        double high = roster.get(0).getAverage();
        String hName = "";
        for (Student s : roster) {
            if (s.getAverage() > high) {
                high = s.getAverage();
                hName = s.getName();
            }
        }
        return hName;
    }

    public String getStudentWithLowestAverage() {
        double low = roster.get(0).getAverage();
        String lName = roster.get(0).getName();
        for (Student s : roster) {
            if (s.getAverage() < low) {
                low = s.getAverage();
                lName = s.getName();
            }
        }
        return lName;
    }

    public String getFailureList(double failingGrade) {
        String output = "";
        for (Student s : roster) {
            if (s.getAverage() <= failingGrade) {
                output += s.getName() + " ";
            }
        }
        return output;
    }

    public String toString() {
        String output = "" + getClassName() + "\n";
        for (Student s : roster) {
            output += s + "    " + s.getAverage() + "\n";
        }
        return output;
    }
}
