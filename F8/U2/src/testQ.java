public class testQ {
    public static void main(String[] args) {
        SyncQueue q = new SyncQueue();

        Producer p1 = new Producer("Producer no 1", q);
        Producer p2 = new Producer("Producer no 2", q);
        Producer p3 = new Producer("Producer no 3", q);

        Thread tp1 = new Thread(p1, "P1");
        //Thread tp2 = new Thread(p2, "P2");
        //Thread tp3 = new Thread(p3, "P3");


        Consumer c1 = new Consumer("C1", q);
        Consumer c2 = new Consumer("C2", q);
        //Consumer c3 = new Consumer("C3", q);

        Thread tc1 = new Thread(c1, "Consumer-C1");
        Thread tc2 = new Thread(c2, "Consumer-C2");
        //Thread tc3 = new Thread(c3, "Consumer-C3");


        tp1.start();
        //tp2.start();
        //tp3.start();

        tc1.start();
        tc2.start();
        //tc3.start();

    }
}
