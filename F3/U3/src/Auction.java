import java.util.ArrayList;

public class Auction {
    private User user;
    private String item;
    private ArrayList<Bid> bids;


    public Auction(User user, String item) {
        bids = new ArrayList<>();
        this.user = user;
        this.item = item;
        bids.add(bid);
    }


}
