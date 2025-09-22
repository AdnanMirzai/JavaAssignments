import javax.management.ObjectName;
import java.util.Iterator;

public class testElement {
    public static void main(String[] args) {

        QueueWithPriority<String> priorityQueue = new QueueWithPriority<>(10);
        priorityQueue.enqueue("my");
        priorityQueue.enqueue("1234");
        priorityQueue.enqueue("Bla bla");
        priorityQueue.enqueue(Priority.HIGH,"Executive order");
        System.out.println(priorityQueue);

        Object[] data = priorityQueue.getAll();
        for (Object datum : data) {
            System.out.println("DATA: " + datum);
        }

        Iterator<String> it = priorityQueue.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
