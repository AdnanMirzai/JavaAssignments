import java.util.ArrayList;

public class Auction {
    private final User owner;
    private final String item;
    private ArrayList<Bid> bids;


    public Auction(User owner, String item) {
        bids = new ArrayList<>();
        this.owner = owner;
        this.item = item;
    }

    public void addBid(Bid bid) {
        bids.add(bid);
    }

    @Override
    public String toString() {
        return this.owner + this.item + bids.toString();
    }
}
