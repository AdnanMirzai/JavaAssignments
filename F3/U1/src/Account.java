public class Account {

    private double balance;
    private final String name;

    private static double interest = 0.25;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(String name) { this(name, 0.0); }

    public double getBalance() { return balance; }
    public String getName() { return name; }

    // static methods; can only reference static members
    public static double getInterest() { return interest; }
    public static void setInterest(double newInterest) { interest = newInterest; }

    public void deposit(double amount) {
        if (amount < 0) { throw new IllegalArgumentException(); }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) { throw new IllegalArgumentException(); }
        balance -= amount;
    }

    @Override
    public String toString() {
        String info = "name: " + name + ", balance: ";
        info += String.format("%.2f", balance);
        return info;
    }
}