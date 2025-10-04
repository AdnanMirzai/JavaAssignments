public class Consumer implements Runnable {

    private String name;
    private SyncQueue queue;

    public Consumer(String name, SyncQueue q) {
        this.name = name;
        this.queue = q;
    }

    @Override
    public void run() {
        while (true) {
            String m = null;
            try {
                m = (String) queue.getFirst();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t/Producer" + name + " got: " + m);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
