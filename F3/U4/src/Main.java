public class Main {
    public static void main(String[] args) {


        //Shared Aggregation because,
        //Other classes can change departure time, as function getDep returns
        //a copy of the reference through which we can change data.
        FlightA flight = new FlightA("Stockholm", "SK1234", new Time(12, 30));
        System.out.println(flight.toString());
        Time depTime = flight.getDepartureTime();
        depTime.tic(1800); // seconds
        System.out.println(flight.toString());



        //FlightB Composite aggregation because,
        //Time has no public use and cannot be accessed in any way if flight2 is gone
        //No references are given to the private Time object associated with Flight2, only copy,
        //therefor its internal values cannot be changed
        //In this case we change some copy of depTime called demTime2, actual copy, int for int
        //depTime2 is a reference variable that points to some other memory slot, that is different from
        //The actual flight depTime.
        FlightB flight2 = new FlightB("Riga", "SK0034", 12, 30, 0);
        System.out.println(flight2.toString());
        Time depTime2 = flight2.getDepartureTime();
        depTime2.tic(1800); // seconds
        System.out.println(flight2.toString());
    }
}
