package designPatterns.patternFacade.flightSearch;

import java.util.ArrayList;
import java.util.Calendar;

public interface FlightSearcherFacade {

    ArrayList<Flight> searchFlight(Calendar fromDate, Calendar toDate, String origin, String destination);
}
