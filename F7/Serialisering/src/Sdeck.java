import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sdeck implements Serializable {
    private final ArrayList<Card> theCards;

    public Sdeck() {
        theCards = new ArrayList<>();
        this.fill();
    }

    public int getSize() { return theCards.size(); }

    public Card dealCard() {
        if(theCards.isEmpty()) throw new IllegalStateException("Deck is empty!");
        Card temp = theCards.getLast();
        theCards.removeLast();
        return temp;
    }

    public List<Card> getCards() { return List.copyOf(theCards); }


    public void shuffleCards() {
        if(theCards.isEmpty()) throw new IllegalStateException("Cannot shuffle, deck is empty!");
        Collections.shuffle(theCards);
    }

    public void fill() {
        if(!theCards.isEmpty()) { this.empty(); }
        theCards.addAll(protoDeck);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i=0;
        for(Card c: theCards) {
            i++;
            builder.append(c.toString()).append(' ');
            if(i == Rank.values().length) {
                builder.append("\n");
                i=0;
            }
        }
        return builder.toString();
    }

    private void empty() { theCards.clear(); }

    private static final ArrayList<Card> protoDeck = new ArrayList<>(); //Fill once at program start and reuse

    static { //Init block for static data
        for(Suit s : Suit.values()) {
            for(Rank r : Rank.values()) {
                protoDeck.add(new Card(s,r));
            }
        }
    }


}
