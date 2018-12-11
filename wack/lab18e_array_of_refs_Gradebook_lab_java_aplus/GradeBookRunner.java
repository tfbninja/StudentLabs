package lab18e_array_of_refs_Gradebook_lab_java_aplus;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.*;
import java.util.Scanner;

public class GradeBookRunner {

    public static void main(String args[]) throws FileNotFoundException {
        out.println("Welcome to the Class Stats program!");

        Scanner keyboard = new Scanner(new File("gradebook.dat"));
        System.out.print("What is the name of this class? ");
        Class bigYeetClass = new Class(keyboard.nextLine());
        System.out.print("How many students are in this class? ");
        int numStudents = keyboard.nextInt();
        for (int i = 0; i < numStudents; i++) {
            keyboard.nextLine();
            System.out.print("Enter the name of student " + (i + 1) + " : ");
            Student temp = new Student();
            temp.setName(keyboard.nextLine());
            System.out.println("Enter the grades for " + temp.getName());
            System.out.print("Use the format x - grades ( 2 - 100 100) : ");
            temp.setGrades(keyboard.nextLine());
            bigYeetClass.addStudent(temp);
        }

        System.out.println(bigYeetClass);
        System.out.println("Failure List = " + bigYeetClass.getFailureList(70));
        System.out.println("Highest Average = " + bigYeetClass.getStudentWithHighestAverage());
        System.out.println("Lowest Average = " + bigYeetClass.getStudentWithLowestAverage());
        System.out.println("Class Average = " + bigYeetClass.getClassAverage());
    }
}
