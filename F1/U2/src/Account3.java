/*
 * An enhanced version of Account3
 * - using the "this" keyword to distinguish between data members
 *   and local variables
 * - overloading the constructor
 * - handling illegal values in deposit/withdraw by throwing an
 *   exception, i.e. terminating the execution
 */
public class Account3 {

    // private fields
    private double balance;
    private final String name;
    private final long accountNr;

    // constructors, called when an object/instance is created
    public Account3(String name, double balance, long accountNr) {
        this.name = name;
        this.accountNr = accountNr;
        if(balance < 0) {
            throw new IllegalArgumentException();
        }
        this.balance = balance;
    }

    public Account3(String name, long accountNr) {
        this.name = name;
        this.balance = 0;
        this.accountNr = accountNr;
    }

    // access methods
    public double getBalance() {
        return balance; // return a copy of the value
    }

    public long getAccountNr() {
        return accountNr;
    }

    public String getName() {
        return name;
    }

    // mutator methods
    public void deposit(double amount) {
        if (amount < 0) {
            // unexpected - terminate execution
            throw new IllegalArgumentException();
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    // other methods
    @Override
    public String toString() {
        String info = "name: " + name;
        info += ", number: " + accountNr;
        info += String.format(", balance %.2f", balance);

        return info;
    }
}
