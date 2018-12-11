package lab18e_array_of_refs_Gradebook_lab_java_aplus;

public class Student implements Comparable {

    private String myName;
    private Grades myGrades;

    public Student() {
        setName("Student " + (int) (Math.random() * 100000));
        setGrades("5 - 0 0 0 0 0");
    }

    public Student(String name, String gradeList) {
        setName(name);
        setGrades(gradeList);
    }

    public boolean equals(Student other) {
        if (other.getAverage() == getAverage()) {
            if (other.getName() == getName()) {
                if (other.getNumGrades() == getNumGrades()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int compareTo(Object other) {
        return (int) Math.round(Math.abs(this.getAverage() - ((Student) other).getAverage()));
    }

    public void setName(String name) {
        this.myName = name;
    }

    public void setGrades(String gradeList) {
        this.myGrades = new Grades(gradeList);
    }

    public void setGrade(int spot, double grade) {
        this.myGrades.setGrade(spot, grade);
    }

    public String getName() {
        return myName;
    }

    public int getNumGrades() {
        return this.myGrades.getNumGrades();
    }

    public double getSum() {
        return this.myGrades.getSum();
    }

    public double getAverage() {
        return this.myGrades.getAverage();
    }

    public double getAverageMinusLow() {
        Grades minusLow = myGrades.clone();
        minusLow.removeLowest();
        return minusLow.getAverage();
    }

    public double getHighGrade() {
        return myGrades.getHighGrade();
    }

    public double getLowGrade() {
        return myGrades.getLowGrade();
    }

    public String toString() {
        return myName + " = " + myGrades;
    }
}
