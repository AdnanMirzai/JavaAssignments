public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if(denominator == 0) throw new RuntimeException("Denominator cannot be 0");
        this.numerator = numerator;
        this.denominator = denominator;
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

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
