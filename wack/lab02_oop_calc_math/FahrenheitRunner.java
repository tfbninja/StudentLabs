package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class FahrenheitRunner {

    public static void main(String[] args) {
        Fahrenheit test = new Fahrenheit();
        test.setFahrenheit(98.6);
        test.print();
        
        test.setFahrenheit(52.30);
        test.print();
        
        test.setFahrenheit(82.45);
        test.print();
        
        test.setFahrenheit(75.00);
        test.print();
        
        test.setFahrenheit(100.00);
        test.print();
    }
}