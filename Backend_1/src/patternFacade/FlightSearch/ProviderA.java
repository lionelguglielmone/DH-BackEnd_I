package patternFacade.FlightSearch;

import java.util.ArrayList;
import java.util.Calendar;

public class ProviderA extends ServiceProvider{

    public ProviderA(String name) {
        super(name);
    }

    @Override
    public ArrayList<Flight> searchFlights(Calendar fromDate, Calendar toDate, String origin, String destination) {
        return null;
    }
}
