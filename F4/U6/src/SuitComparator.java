import java.util.Comparator;

public class SuitComparator implements Comparator<Card> {

    public int compare(Card c1, Card c2)
    {
        if(c1.suit().getValue()>c2.suit().getValue())
            return 1;

        else if(c1.suit().getValue()==c2.suit().getValue())
        {
            int val1, val2;
            if(c1.rank() == Rank.ACE) {
                val1 = 14;
                return val1 - c2.rank().getValue();
            }

            else if(c2.rank() == Rank.ACE) {
                val2 = 14;
                return c1.rank().getValue() - val2;
            }
            else return 0;
        }

        else
            return -1;
    }

}
