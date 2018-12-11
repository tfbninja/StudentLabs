package lab18f_list_of_references_number;

import lab09_while_dowhile.*;

public class Perfect {

    private int number;

    public Perfect() {
        number = 0;
    }

    public Perfect(int num) {
        this.number = num;
    }

    public void setNum(int num) {
        this.number = num;
    }

    public boolean isPerfect() {
        int sumDivs = 0;
        int i = 1;
        while (i < this.number) {
            if (this.number % i == 0) {
                sumDivs += i;
            }
            i++;
        }
        if (this.number == sumDivs) {
            return true;
        }
        return false;

    }
    //add a toString	
}
