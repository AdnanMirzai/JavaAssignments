public class RationalMain {
    public static void main(String[] args) {
        Rational R1 = new Rational(1,2);
        System.out.println(R1.toString());

        Rational R2 = new Rational(2);
        System.out.println(R2.toString());

        Rational R3;
        R3 = R1.add(R2);
        System.out.println(R3.toString());
    }
}