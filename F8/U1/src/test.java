public class test {
    public static void main(String[] args) throws InterruptedException {
        DigitalClock clock = new DigitalClock("GMT-6");
        DigitalClock clock2 = new DigitalClock("EST");
        DigitalClock clock3 = new DigitalClock("");

        clock.startClock();
        clock2.startClock();
        clock3.startClock();

        //clock.run(); Misstag, start startar ju run!
        //clock2.run();
        //clock3.run();

        Thread.sleep(1000);

        clock.stopClock();

        Thread.sleep(1000);
        clock2.stopClock();
        Thread.sleep(1000);
        clock3.stopClock();


    }
}
