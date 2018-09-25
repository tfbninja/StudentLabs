package lab05a_ifs_labs;

import java.text.DecimalFormat;

/*
 *
 * @author Tim Barber
*/

public class Discount {
    //instance variables and constructors could be used, but are not really needed

    //getDiscountedBill() will return final amount of the bill
    //			if the bill is >2000, the bill receives a 15% discount
    public static double getDiscountedBill(double bill) {
        DecimalFormat f = new DecimalFormat("##.00");
        double prev = Double.parseDouble(f.format(bill));
        double after = Double.parseDouble(f.format(bill * 0.85));
        if (bill <= 2000) {
            return prev;
        } else {
            return after;
        }
    }
}
