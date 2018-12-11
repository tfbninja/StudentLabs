package lab18e_array_of_refs_Gradebook_lab_java_aplus;

import static java.lang.System.*;

public class StudentTester {

    public static void main(String args[]) {
        Student stu = new Student("Billy Bob", "5 - 90 85 95.5 77.5 88");
        out.println(stu);
        out.println("sum = " + stu.getSum());
        out.println("average = " + stu.getAverage());
        out.println("average after dropping low grade = " + stu.getAverageMinusLow());
        out.println("low grade = " + stu.getLowGrade());
        out.println("high grade = " + stu.getHighGrade());
        // yee
    }
}
