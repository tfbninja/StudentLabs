package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public class AverageRunner {

    public static void main(String[] args) {
        Average calc = new Average(5,5);
        calc.calculate();
        calc.print();
        
        calc.setNums(90, 100.0);
        calc.calculate();
        calc.print();
        
        calc.setNums(100, 85.8);
        calc.calculate();
        calc.print();
        
        calc.setNums(-100, 55);
        calc.calculate();
        calc.print();
        
        calc.setNums(15236, 5642);
        calc.calculate();
        calc.print();
        
        calc.setNums(1000, 555);
        calc.calculate();
        calc.print();
        
    }
}
