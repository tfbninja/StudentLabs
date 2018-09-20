package lab02_oop_calc_math;
import java.text.DecimalFormat;
import java.math.RoundingMode;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Fahrenheit {

    private double fTemp;

    public void setFahrenheit(double fahren) {
        fTemp = fahren;
    }

    public double getCelsius() {
        double celsius = 0.0;
        String sigFigs = "";
        boolean period = false;
        String afterPoint = "";
        //add code to convert fahrenheit to celsius
        celsius = ((fTemp - 32.0)*5.0)/9.0;
        sigFigs = Double.toString(celsius);
        for (int i = 0; i < sigFigs.length(); i++){
            
            if (sigFigs.charAt(i) == '.'){
                period = true;
            }
            if (period == true){
                afterPoint += sigFigs.charAt(i);
            }
        }
        if (afterPoint.length() >= 3){
            DecimalFormat df = new DecimalFormat("#.####");
            df.setRoundingMode(RoundingMode.HALF_UP);
            celsius = Double.valueOf(df.format(celsius));
        }
        return celsius;
    }

    public void print() {
        //this is part of the solution
        System.out.println(fTemp + " degrees Fahrenheit == " + getCelsius() + " degrees Celsius");
    }
}