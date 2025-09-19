public class Money implements IMoney2 {

    private final double amount;
    private final Currency currency;

    public Money(double amount, Currency currency) throws IllegalArgumentException {
        if (amount < 0) throw new IllegalArgumentException("Negative amount");
        this.amount = amount;
        this.currency = currency;
    }

    public Money(Currency currency) {
        this(0, currency);
    }

    public Money() {
        this(0, Currency.EUR);
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public Money copy() {
        return new Money(this.amount, this.currency);
    }

    @Override
    public Money toCurrency(Currency newCurrency) {
        return new Money(calculateAmountIn(newCurrency), newCurrency);
    }

    @Override
    public Money add(Money moneyToAdd) {
        double sum = moneyToAdd.calculateAmountIn(this.currency) + this.amount;
        return new Money(sum, this.currency);
    }

    @Override
    public Money subtract(Money moneyToAdd) throws IllegalArgumentException {
        double sum = moneyToAdd.amount + this.amount;
        if (sum < 0) throw new IllegalArgumentException();
        return new Money(sum, this.currency);
    }

    @Override
    public String toString() {
        return String.format("Amount %.2f, Currency: %s", amount, currency);
    }

    @Override
    public int compareTo(Money other) {
        double thisInEuro = this.calculateAmountIn(Currency.EUR);
        double otherInEuro = other.calculateAmountIn(Currency.EUR);
        if (Math.abs(thisInEuro - otherInEuro) < 1E-3) {
            return 0;
        } else if (thisInEuro > otherInEuro) {
            return 1;
        } else return -1;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Money) {
            return this.compareTo((Money) other) == 0;
        }
        return false;
    }

    private double calculateAmountIn(Currency newCurrency) {
        return amount * this.currency.getRate() / newCurrency.getRate();
    }
}