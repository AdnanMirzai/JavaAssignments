import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testComparator {
    public static void main(String[] args) {

        ArrayList<Card> cards = new ArrayList<>();

        for(Suit s : Suit.values()) {
            for(Rank r : Rank.values()) {
                cards.add(new Card(s, r));
            }
        }

        System.out.println("Original: " + cards.toString());

        Collections.shuffle(cards);
        System.out.println("Shuffled: " + cards.toString());

        Comparator<Card> rankComparator = new RankComparator();
        Collections.sort(cards, rankComparator);
        System.out.println("Sorted by Rank: " + cards.toString());

        Comparator<Card> suitComparator = new SuitComparator();
        Collections.sort(cards, suitComparator);
        System.out.println("Sorted by Suit: " + cards.toString());


    }
}

