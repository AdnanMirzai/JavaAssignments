package money;

public enum Currency {

    EUR("euro", 1.00),
    SEK("kronor", 0.095),
    USD("dollar", 0.91),
    NOK("kronor", 0.092);

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    private String name;
    private double rate; // rate vs EUR

    private Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
}
