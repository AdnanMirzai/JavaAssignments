public class testMoney {
    public static void main(String[] args) {
        Money mymoney = new Money(5000, Currency.SEK);
        Money test = new Money(Currency.NOK);
        System.out.println(mymoney.toString());
        System.out.println(test.toString());

        System.out.println(mymoney.compareTo(test));
        System.out.println(mymoney.equals(test));
    }
}
