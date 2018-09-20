package lab02_oop_calc_math;

/*
 * 
 * @author Tim Barber
*/
public class Average {
    //instance variables

    private double average, num1, num2;
    
    public Average(double n1, double n2){
        num1 = n1;
        num2 = n2;
    }
    public Average(){
        num1 = 0;
        num2 = 0;
    }
    
    public void setNums(double n1, double n2){
        num1 = n1;
        num2 = n2;
    }

    public void calculate() {
        average = (num1 + num2) / 2.0;
    }

    public void print() {
        System.out.println(num1 + " + " + num2 + " has an average of " + average);
    }
}