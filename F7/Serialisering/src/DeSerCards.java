import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeSerCards {
    public static void main(String[] args) {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("cards.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            List<Card> cards = (List<Card>) ois.readObject();
            System.out.println("DeSer completed");
            for (Card card : cards) {
                System.out.println(card.toString());
            }
        }
        catch(IOException e) {
            System.out.println(e);
            }
        catch(ClassNotFoundException c) {
            System.out.println(c);
            }
        finally {
            try {
                if(fin!=null) fin.close();
            }
            catch (IOException e) {}
        }

    }
}
