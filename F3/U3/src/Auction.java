import java.util.ArrayList;

public class Auction {
    private final User owner;
    private final String item;
    private final ArrayList<Bid> bids;


    public Auction(User owner, String item) {
        bids = new ArrayList<>();
        this.owner = owner;
        this.item = item;
    }

    public void addBid(User bidder, int amount) {
        Bid bid = new Bid(bidder, amount);
        bids.add(bid);
    }

    @Override
    public String toString() {
        return "Auction {" + "Owner: " + owner.getName() + ", Item: " + item + "}\n" + "bids: " + bids.toString();
    }
}
