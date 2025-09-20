public class testQueue {
    public static void main(String[] args) {

        GenericQueue <String> q = new GenericQueue<>(4);
        q.enqueue("Buy a textbook");
        q.enqueue("Follow the lectures");
        q.enqueue("Read the textbook");
        q.enqueue("Write code");
        System.out.println(q);

        q.dequeue();
        q.enqueue("Do it again");
        System.out.println(q);

        String s = q.dequeue();
        System.out.println("Dequeued: " + s);

        s = q.peek();
        System.out.println("Peeked at: " + s);

        while(!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
        System.out.println(q);

        //test generic
        GenericQueue <Integer> q2 = new GenericQueue<>();
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);
        System.out.println(q2);

        Integer i = q2.dequeue();
        System.out.println("Dequeued: " + i);
        System.out.println(q2);
        System.out.println(q2.getNrOfElements());


        System.out.println("Get all: ");
        Object[] contents = q2.getAll();
        for (Object content : contents) {
            System.out.println(content);
        }

    }
}
