public record Bid(User bidder, int amount) {

    @Override
    public String toString() {
        return "[" + bidder.getName() + ", " + amount + "kr]";
    }
}
