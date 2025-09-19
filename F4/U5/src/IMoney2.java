package money;

/**
 * Represents an amount of money, represented in a specific currency.
 * Instances of this class are <em>immutable</em>.
 * <p>
 * The implementing class must have three constructors, with two arguments,
 * (throws IllegalArgumentException if amount < 0) one argument (amount 0),
 * and no arguments (amount 0, currency EUR).
 */
public interface IMoney2 extends Comparable<Money> {

    /**
     * Return the amount for this money.Money.
     */
    double getAmount();

    /**
     * Return the currency for this money.Money.
     */
    Currency getCurrency();

    /**
     * Return a copy of this instance.
     */
    Money copy();

    /**
     * Create a new money.Money instance, with the indicated currency and the
     *
     * @param newCurrency
     * @return a new money.Money instance.
     */
    Money toCurrency(Currency newCurrency);

    /**
     * Create a new money.Money instance with the sum, in the same currency as this.
     *
     * @param moneyToAdd the money to add to this money
     * @return a new money.Money instance in the same currency as this.
     */
    Money add(Money moneyToAdd);

    /**
     * Create a new money.Money instance with the difference, in the same currency as this.
     *
     * @param moneyToAdd the money to add to this money
     * @return a new money.Money instance in the same currency as this.
     * @throws IllegalArgumentException if the sum is less than zero.
     */
    Money subtract(Money moneyToAdd) throws IllegalArgumentException;

    /**
     * Return a string with the amount, rounded to two decimals, and the currency.
     */
    @Override
    String toString();

    /**
     * Compare amounts, internally converted to EUR. Two instances are
     * considered equal if amounts differ less than 1E-3.
     * Also see documentation for interface java.lang.Comparable.
     */
    @Override
    int compareTo(Money other);

    /**
     * Compare amounts, internally converted to EUR. Two instances are
     * considered equal if amounts differ less than 1E-3.
     * Also see documentation for class java.lang.Object.
     */
    @Override
    boolean equals(Object other);
}
