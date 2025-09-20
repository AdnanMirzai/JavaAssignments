import java.util.Iterator;

public class testIterator {
    public static void main(String[] args) {
        GenericQueue <String> q = new GenericQueue<>(100);
        q.enqueue("Buy a textbook");
        q.enqueue("Follow the lectures");
        q.enqueue("Read the textbook");
        q.enqueue("Write code");
        System.out.println(q);

        Iterator<String> it = q.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for(String s : q) {
            System.out.println(s);
        }

    }
}
