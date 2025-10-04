public class Producer implements Runnable {

    private String name;
    private SyncQueue queue;
    private int nr = 0;

    public Producer(String name, SyncQueue q) {
        this.name = name;
        this.queue = q;
    }

    @Override
    public void run() {
        while(true) {
            String m = "Message " + ++nr + " by producer " + name;
            System.out.println("Put: " + m);

            try {
                queue.putLast(m);
            } catch (InterruptedException _) {}
            try {
                Thread.sleep(1000);
            } catch (InterruptedException _) {}
        }
    }
}