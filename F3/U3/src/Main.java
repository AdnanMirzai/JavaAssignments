public class Main {
    public static void main(String[] args) {
        User Adnan = new User("Adnan", "adn@kth.se", "1234");
        User Anders = new User("Anders", "aslm@kth.se", "42");
        User Reine = new User("Reine", "remb@kth.se", "4711");

        Auction auction = new Auction(Reine, "The Shining, DVD");
        auction.addBid(Adnan,50);
        auction.addBid(Anders,100);
        auction.addBid(Adnan,1000);

        System.out.println(auction.toString());
    }
}
