package lab18e_array_of_refs_Gradebook_lab_java_aplus;

public class Grade {

    private double value;

    public Grade() {
        value = 0.0;
    }

    public Grade(double value) {
        this.value = value;
    }

    public void setGrade(int value) {
        this.value = value;
    }

    public double getGrade() {
        return this.value;
    }

    public char getLetterGrade() {
        int simp = (int) ((value - 50) / 10);
        if (simp >= 4) {
            return 'A';
        } else if (simp >= 3) {
            return 'B';
        } else if (simp >= 2) {
            return 'C';
        } else if (simp >= 1) {
            return 'D';
        } else {
            return 'F';
        }

    }

    @Override
    public String toString() {
        return String.valueOf(this.value) + "\n" + getLetterGrade();
    }
}
