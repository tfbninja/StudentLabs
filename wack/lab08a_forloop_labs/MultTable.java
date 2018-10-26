package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class MultTable {

    private int number;
    private int stop;

    public MultTable() {
        number = stop = 0;
    }

    public MultTable(int num, int end) {
        this.number = num;
        this.stop = end;
    }

    public void setTable(int num, int end) {
        this.number = num;
        this.stop = end;
    }

    public String printTable() {
        String output = "multiplication table for " + this.number + "\n";
        int index = 1;
        for (int i = this.number; i <= this.stop * this.number; i += this.number) {
            output += index + "    " + i + "\n";
            index++;
        }
        return output;
    }

    @Override
    public String toString() {
        return printTable();
    }
}
