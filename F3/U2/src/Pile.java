import java.util.ArrayList;

public class Pile {
    private ArrayList<Card> pile;

    public Pile() {
        pile = new ArrayList<>();
    }

    public int getSize() {
        return pile.size();
    }

    public void clear() {
        pile.clear();
    }

    public void addCard(Card card) {
        pile.addLast(card);
    }

    public Card get(int index) {
        return pile.get(index);
    }

    public Card remove(int index) {
        Card temp = pile.get(index);
        pile.remove(index);
        return temp;
    }

    @Override
    public String toString () {
        return pile.toString();
    }

}
