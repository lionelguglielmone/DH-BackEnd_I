package patternFacade.FlightSearch;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class ServiceProvider {
    private String name;

    public ServiceProvider(String name) {
        this.name = name;
    }

    public abstract ArrayList<Flight> searchFlights(Calendar fromDate, Calendar toDate, String origin, String destination);
}
