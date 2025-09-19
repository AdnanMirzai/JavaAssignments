
public class Money implements IMoney2 {

    double amount;
    Currency currency;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money(double amount) {
        this.amount = amount;
        this.currency = Currency.EUR;
    }

    public Money() {
        this.amount = 0;
        this.currency = Currency.EUR;
    }

    public double getAmount() { return amount; }

    public Currency getCurrency() { return currency; }

    public Money copy() { return new Money(this.amount, this.currency); }

    public Money toCurrency(Currency newCurrency) { return new Money(this.amount, newCurrency); }

    public Money add(Money moneyToAdd) {
        double sum = moneyToAdd.amount + this.amount;
        return new Money(sum, this.currency);
    }

    public Money subtract(Money moneyToAdd) throws IllegalArgumentException {
        double sum = moneyToAdd.amount + this.amount;
        if(sum < 0) throw new IllegalArgumentException();
        return new Money(sum, this.currency);
    }

    @Override
    public String toString() {
        return String.format("Amount %.2f, Currency: %s", amount, currency);
    }
    @Override
    public int compareTo(Money other) {
        return 0;
    }


}
