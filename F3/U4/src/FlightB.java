public class FlightB {
    private String destination, flightNr;
    private Time departureTime;

    public FlightB(String destination, String flightNr, int h, int m, int s) {
        this.destination = destination;
        this.flightNr = flightNr;
        this.departureTime = new Time(h,m,s);
    }

    public String getDestination() { return destination; }
    public String getFlightNr() { return flightNr; }

    public Time getDepartureTime() {
        int h = departureTime.getH();
        int m = departureTime.getM();
        int s = departureTime.getS();
        return new Time(h,m,s);
    }

    @Override
    public String toString() {
        return destination + ", " + flightNr + ", " + departureTime;
    }
}