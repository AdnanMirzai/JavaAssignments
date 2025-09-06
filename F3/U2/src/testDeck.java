public class testDeck {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.shuffleCards();

        System.out.println( myDeck.toString());

        System.out.println("Here is your Card: " + myDeck.dealCard());
        System.out.println( myDeck.toString());

        myDeck.shuffleCards();
        System.out.println( myDeck.toString());
    }
}
