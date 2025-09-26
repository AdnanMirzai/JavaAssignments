import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class serializeCards {
    public static void main(String[] args) throws IOException {

        Sdeck serDeck = new Sdeck();
        Sdeck readDeck = new Sdeck();
        serDeck.shuffleCards();
        List<Card> cards =  serDeck.getCards();

        FileOutputStream fileOut = null;

        try {
            fileOut = new FileOutputStream("Cards.ser");
            ObjectOutputStream ous = new ObjectOutputStream(fileOut);
            ous.writeObject(cards);
            System.out.println("Serializing successful!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            if(fileOut!=null) fileOut.close();
        }


    }
}
