import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

//Most times it is better to implement runnable rather than extend Thread! Because then you cant extend anything else!


public class DigitalClock implements Runnable   {
    private Thread clockThread;
    private final DateFormat df = DateFormat.getTimeInstance();

    public DigitalClock(String zone) {
        df.setTimeZone(TimeZone.getTimeZone(zone));
    }

    synchronized public void startClock() {
        if(clockThread == null) {
            clockThread = new Thread(this);
            clockThread.start(); //kommer efter massa bakgrundsgrejer att köra run() metoden!
        }
    }

    synchronized public void stopClock() throws InterruptedException {
        clockThread = null;
    }

    @Override
    public void run() {
        while(Thread.currentThread() == clockThread) {
            System.out.println(df.format(new Date()));
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie) {}
        }
    }
}