package designPatterns.patternFacade.buyService;

import java.util.ArrayList;

public class DeliveryService {
    private ArrayList<Address> addresses;

    public DeliveryService() {
        this.addresses = new ArrayList<>();
    }

    public boolean processDelivery(Product p, Address a){
        boolean readyToDeliver = canBeSendTo(a);
        return readyToDeliver;

    }

    private boolean canBeSendTo(Address a){
        boolean addressFound = false;
        for (Address address : this.addresses){
            if (address.getStreet().equals(a.getStreet()) && address.getNumber().equals(a.getNumber())){
                addressFound = true;
                break;
            }
        }
        return addressFound;
    }
}
