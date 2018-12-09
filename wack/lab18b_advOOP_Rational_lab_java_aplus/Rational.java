package lab18b_advOOP_Rational_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
class Rational implements Comparable<Rational> {

    private int num;
    private int den;

    public Rational() {
        num = 1;
        den = 1;
    }

    public Rational(int numerator, int denominator) {
        num = numerator;
        den = denominator;
    }

    public void setRational(int numerator, int denominator) {
        num = numerator;
        den = denominator;
    }

    public void setNumerator(int numerator) {
        num = numerator;
    }

    public void setDenominator(int denominator) {
        den = denominator;
    }

    public int getNumerator() {
        return num;
    }

    public int getDenominator() {
        return den;
    }

    public void add(Rational other) {
        //num1/den1 + num2/den2 
        //new numerator = (num1 * den2 + num2 * den1)
        //new denominator = (den1 * den2)
        num = num * other.getDenominator() + other.getNumerator() * den;
        den = den * other.getDenominator();
        reduce();
    }

    public void reduce() {
        while (gcd(num, den) != 1) {
            int gcdNum = gcd(num, den);
            num /= gcdNum;
            den /= gcdNum;
        }
    }

    private int gcd(int numOne, int numTwo) {
        int gcd = 1;
        for (int i = 2; i < numOne + numTwo; i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public Object clone() {
        return this;
    }

    public boolean equals(Rational obj) {
        obj.reduce();
        if (obj.getNumerator() == getNumerator()) {
            if (obj.getDenominator() == getDenominator()) {
                return true;
            }
        }
        return false;
    }

    public int compareTo(Rational other) {
        if (this.num / (double) this.den > other.getNumerator() / (double) other.getDenominator()) {
            return 1;
        } else if (this.num / (double) this.den == other.getNumerator() / (double) other.getDenominator()) {
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }
}
