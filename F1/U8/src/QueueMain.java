public class QueueMain {
    public static void main(String[] args) {

        Queue q = new Queue(4);
        q.add("Buy a textbook");
        q.add("Follow the lectures");
        q.add("Read the textbook");
        q.add("Write code");
        System.out.println(q.toString());

        q.remove();
        q.add("Do it again");
        System.out.println(q.toString());

        String s = q.remove();
        System.out.println("Dequeued: " + s);

        s = q.peek();
        System.out.println("Peeked at: " + s);

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println(q.toString());
    }
}
