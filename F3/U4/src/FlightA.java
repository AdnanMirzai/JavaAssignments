public class FlightA {
    private String destination, flightNr;
    private Time departureTime;

    public FlightA(String destination, String flightNr, Time departureTime) {
        this.destination = destination;
        this.flightNr = flightNr;
        this.departureTime = departureTime;
    }

    public String getDestination() { return destination; }
    public String getFlightNr() { return flightNr; }
    public Time getDepartureTime() { return departureTime; }

    @Override
    public String toString() {
        String info = destination + ", " + flightNr;
        info += ", departure: " + departureTime.toString();
        return info;
    }
}
