import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Card> cards = new ArrayList<>();
       for(Suit s:Suit.values()) {
           for(Rank r:Rank.values()) {
               cards.add(new Card(r,s));
           }
       }
        Collections.shuffle(cards);
        System.out.println("Before sort");
        System.out.println(genString(cards));


        for(Suit s:Suit.values()) {
            for(Rank r:Rank.values()) {
                Collections.sort(cards);
            }
        }
        System.out.println("After sort");
        System.out.println(genString(cards));
    }


    private static String genString(List<Card> cards) {
        StringBuilder builder = new StringBuilder();
        int i=0;
        for(Card c:cards) {
            i++;
            builder.append(c.toShortString()).append(' ');
            if(i==Rank.values().length) {
                builder.append("\n");
                i=0;
            }
        }
        return builder.toString();
    }
}