package lab18f_list_of_references_number;

public class Number {

    private Integer number;

    public Number() {
        number = 0;
    }

    public Number(int num) {
        number = num;
    }

    public void setNumber(int num) {
        number = num;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOdd() {
        return number % 2 == 1;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isPerfect() {
        Perfect tester = new Perfect(number);
        return tester.isPerfect();
    }

    public String toString() {
        return "" + number;
    }
}
