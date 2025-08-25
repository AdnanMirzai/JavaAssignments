public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if(denominator == 0) throw new RuntimeException("Denominator cannot be 0");
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getDenominator() {return this.denominator;}
    public int getNumerator() {return this.numerator;}

    public void setDenominator(int denominator) {this.denominator = denominator;}
    public void setNumerator(int numerator) {this.numerator = numerator;}

    public Rational add(Rational r) {
        int newNumerator = (this.numerator * r.denominator) + (this.denominator * r.numerator);
        int newDenominator = (this.denominator * r.denominator);
        return new Rational(newNumerator, newDenominator);
    }

    private int greatestCommonDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while(a!=b) {
            if(a>b) a-=b;
            else b-=a;
        }
        return a;
    }

    private void reduce() {
        int gcd = greatestCommonDivisor(this.numerator,this.denominator);
        this.numerator = this.numerator/gcd;
        this.denominator = this.denominator/gcd;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}