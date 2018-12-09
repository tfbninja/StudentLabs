package lab18e_array_of_refs_Gradebook_lab_java_aplus;

public class Grade {

    private double value;

    //add in two constructors
    public Grade() {
        value = 0.0;
    }

    public Grade(int value) {
        this.value = value;
    }

    public void setGrade(int value) {
        this.value = value;
    }

    public double getGrade() {
        return this.value;
    }

    public char getLetterGrade() {
        // I've only written this by hand and on the computer ~30 times at this point....
        // here's a more creative and concise method
        char[] letters = {'F', 'D', 'C', 'B', 'A'};
        try {
            return letters[(int) (value / 20 - 2)];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 'F';
        }

    }

    @Override
    public String toString() {
        return String.valueOf(this.value) + "\n" + getLetterGrade();
    }
}
