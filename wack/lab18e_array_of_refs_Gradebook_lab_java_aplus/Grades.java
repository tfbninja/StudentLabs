package lab18e_array_of_refs_Gradebook_lab_java_aplus;

import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    private ArrayList<Grade> grades;

    public Grades(String gradeList) {
        grades = new ArrayList<>();
        Scanner chop = new Scanner(gradeList);
        chop.next();
        chop.next();
        while (chop.hasNext()) {
            this.grades.add(new Grade(Double.valueOf(chop.next())));
        }
    }

    public void addGrade(double grade) {
        this.grades.add(new Grade(grade));
    }

    public void setGrade(int spot, double grade) {
        this.grades.set(spot, new Grade(grade));
    }

    public double getSum() {
        double sum = 0.0;
        for (Grade g : grades) {
            sum += g.getGrade();
        }
        return sum;
    }

    public double getAverage() {
        double sum = getSum();
        return sum / grades.size();
    }

    public double getLowGrade() {
        double low = grades.get(0).getGrade();
        for (Grade g : grades) {
            if (g.getGrade() < low) {
                low = g.getGrade();
            }
        }
        return low;
    }

    public void removeLowest() {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getGrade() == getLowGrade()) {
                grades.remove(i);
            }
        }
    }

    public double getHighGrade() {
        double high = grades.get(0).getGrade();
        for (Grade g : grades) {
            if (g.getGrade() > high) {
                high = g.getGrade();
            }
        }
        return high;
    }

    public Grades clone() {
        return new Grades("- - " + toString()); // added "- - "because constructor auto-discards first two tokens
    }

    public int getNumGrades() {
        return grades.size();
    }

    public String toString() {
        String output = "";
        for (Grade g : grades) {
            output += g.getGrade() + " ";
        }
        output = output.trim();
        return output;
    }
}
