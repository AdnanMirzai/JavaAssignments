public class testPile {
    public static void main(String[] args) {
        Pile myPile = new Pile();
        System.out.println(myPile.toString());
        Card lucky = new Card(Suit.SPADES, Rank.ACE);
        Card unLucky = new Card(Suit.DIAMONDS, Rank.JACK);
        myPile.addCard(lucky);
        System.out.println(myPile.toString());
        System.out.println(myPile.getSize());
        System.out.println(myPile.get(0));
        System.out.println(myPile.toString());
        myPile.clear();
        System.out.println(myPile.toString());
        myPile.addCard(lucky);
        myPile.addCard(unLucky);
        System.out.println(myPile.toString());
        System.out.println(myPile.remove(1));
        System.out.println(myPile.toString());
    }
}
