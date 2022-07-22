package designPatterns.patternFacade.flightSearch;

import java.util.ArrayList;
import java.util.Calendar;

public class ProviderC extends ServiceProvider{

    public ProviderC(String name) {
        super(name);
    }

    @Override
    public ArrayList<Flight> searchFlights(Calendar fromDate, Calendar toDate, String origin, String destination) {
        return null;
    }
}
