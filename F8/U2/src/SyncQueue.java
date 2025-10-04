import java.util.LinkedList;
import java.util.List;

public class SyncQueue<T> {

    public static final int MAX_SIZE = 5;
    private List<T> messages;

    public SyncQueue() {

        messages = new LinkedList<>();
    }


    public synchronized void putLast(T msg) throws InterruptedException {
        while (messages.size()>=MAX_SIZE) {
            wait();
        }
        messages.add(msg);
        notifyAll();
    }

    public synchronized T getFirst() throws InterruptedException {
        while (messages.isEmpty()) {
            wait();
        }
        T temp = messages.getFirst();
        notifyAll();
        return temp;
    }
}