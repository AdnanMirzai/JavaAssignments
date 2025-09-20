import java.util.Comparator;

public class RankComparator implements Comparator<Card> {

    public int compare(Card c1, Card c2) {
        if(c1.rank().getValue()>c2.rank().getValue()) return 1;
        else if (c1.rank().getValue()<c2.rank().getValue()) return -1;
        else return 0;
    }
}
