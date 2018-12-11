package lab18e_array_of_refs_Gradebook_lab_java_aplus;

import static java.lang.System.*;

public class GradesRunner {

    public static void main(String args[]) {
        Grades test = new Grades("5 - 90 85 95.5 77.5 88");
        out.println(test);
        out.println("sum = " + test.getSum());
        out.println("num grades = " + test.getNumGrades());
        out.println("low grade = " + test.getLowGrade());
        out.println("high grade = " + test.getHighGrade());
        out.println("average = " + test.getAverage());

        Grades test2 = new Grades("9 - 10 70 90 92.5 85 95.5 77.5 88 100.0");
        out.println(test2);
        out.println("sum = " + test2.getSum());
        out.println("num grades = " + test2.getNumGrades());
        out.println("low grade = " + test2.getLowGrade());
        out.println("high grade = " + test2.getHighGrade());
        out.println("average = " + test2.getAverage());
    }
}
