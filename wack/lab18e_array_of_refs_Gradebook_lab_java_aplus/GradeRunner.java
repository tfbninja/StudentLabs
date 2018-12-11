package lab18e_array_of_refs_Gradebook_lab_java_aplus;

import java.util.ArrayList;

public class GradeRunner {

    public static void main(String args[]) {
        /*
         * 92.5
         * A
         * 77.5
         * C
         * 47.5
         * F
         * 87.5
         * B
         */
        ArrayList<Grade> grades = new ArrayList<>();
        grades.add(new Grade(92.5));
        grades.add(new Grade(77.5));
        grades.add(new Grade(47.5));
        grades.add(new Grade(87.5));

        for (Grade g : grades) {
            System.out.println(g);
        }

    }
}
