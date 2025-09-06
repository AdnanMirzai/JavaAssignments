import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        Card[] allCards = new Card[52];
        int i=0;
        for(Suit s : Suit.values()) {
            for(Rank r : Rank.values()) {
                allCards[i] = new Card(s, r);
                    i++;
            }
        }
        fill(allCards);
    }

    public void shuffleCards() {
        Collections.shuffle(deck);
    }

    private void fill(Card[] cards) {
        if(!deck.isEmpty()) {empty();}
        deck.addAll(Arrays.asList(cards));
    }

    private void empty() {
        deck.clear();
    }


    public Card dealCard() {
        Card temp = deck.getLast();
        deck.removeLast();
        return temp;
    }

    @Override
    public String toString() {
        return deck.toString() + "\n" + deck.size() + " Cards";
    }
}