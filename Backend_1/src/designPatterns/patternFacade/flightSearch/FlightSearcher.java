package designPatterns.patternFacade.flightSearch;

import java.util.ArrayList;
import java.util.Calendar;

public class FlightSearcher implements FlightSearcherFacade{
    private ProviderA providerA;
    private ProviderB providerB;
    private ProviderC providerC;

    public FlightSearcher(ProviderA providerA, ProviderB providerB, ProviderC providerC) {
        this.providerA = providerA;
        this.providerB = providerB;
        this.providerC = providerC;
    }

    @Override
    public ArrayList<Flight> searchFlight(Calendar fromDate, Calendar toDate, String origin, String destination) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.addAll(this.providerA.searchFlights(fromDate, toDate, origin, destination));
        flights.addAll(this.providerB.searchFlights(fromDate, toDate, origin, destination));
        flights.addAll(this.providerC.searchFlights(fromDate, toDate, origin, destination));

        return flights;
    }
}
