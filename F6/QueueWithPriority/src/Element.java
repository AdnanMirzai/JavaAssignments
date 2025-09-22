public class Element<T> {
    private final Priority priority;
    private final T data;

    public Element(Priority priority, T data) {
        this.priority = priority;
        this.data = data;
    }

    public Element(T data) {
        this(Priority.NORMAL, data);
    }

    public Priority getPriority() { return priority; }
    public T getData() { return data; }

    @Override
    public String toString() {
        return "Element{" +
                "priority=" + priority +
                ", data=" + data +
                '}';
    }
}
