import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueWithPriority<T> implements Iterable<T> {

    private final ArrayList<Element<T>> queue;

    public QueueWithPriority(int size) {
        if(size<=0) throw new IllegalArgumentException("Positive size needed");
        this.queue = new ArrayList<>(size);
    }

    public QueueWithPriority() { this(10); }

    public int getNrOfElements() { return queue.size(); }

     public T[] getAll() {
        if (isEmpty()) return null;

        T[] temp = (T[]) new Object[queue.size()];
        for(int i=0; i<queue.size(); i++) {
            temp[i] = queue.get(i).getData();
        }
        return temp;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException();
        return queue.getFirst().getData();
    }

    public boolean isEmpty() { return queue.isEmpty(); }

    public void enqueue(T data) {
        queue.add(new Element<>(data));
    }

    public void enqueue(Priority priority, T data) {
        if(priority == Priority.HIGH) {
            queue.addFirst(new Element<>(Priority.HIGH, data));
        }
        else queue.add(new Element<>(data));
    }

    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("List is empty!");

        T temp = queue.getFirst().getData();
        this.pack();
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Contents: ");
        for (Element<T> tElement : queue) {
            info.append("[");
            info.append(tElement);
            info.append("] ");
        }
        return info.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private void pack() {
        for (int i = 0; i < queue.size()-1; i++) {
            queue.set(i,queue.get(i+1));
        }
    }

    /*/Private Iterator Class/*/
    private class QueueIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < queue.size();
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            return queue.get(currentIndex++).getData();
        }
    }

}
