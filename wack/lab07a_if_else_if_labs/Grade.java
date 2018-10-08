package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Grade {

    private int numGrade;

    public Grade() {
        numGrade = -1;
    }

    public Grade(int grade) {
        numGrade = grade;
    }

    public void setGrade(int grade) {
        numGrade = grade;
    }

    public String getLetterGrade() {
        String letGrade;
        if (numGrade >= 90){
            letGrade = "A";
        } else if (numGrade >= 80){
            letGrade = "B";
        } else if (numGrade >= 75){
            letGrade = "C";
        } else if (numGrade >= 70){
            letGrade = "D";
        } else {
            letGrade = "F";
        }
        return letGrade;
    }

    public String toString() {
        return numGrade + " is a " + getLetterGrade() + "\n";
    }
}