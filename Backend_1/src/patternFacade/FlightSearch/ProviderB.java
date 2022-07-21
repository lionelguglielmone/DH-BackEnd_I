package patternFacade.FlightSearch;

import java.util.ArrayList;
import java.util.Calendar;

public class ProviderB extends ServiceProvider{

    public ProviderB(String name) {
        super(name);
    }

    @Override
    public ArrayList<Flight> searchFlights(Calendar fromDate, Calendar toDate, String origin, String destination) {
        return null;
    }
}
