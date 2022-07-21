package patternFacade.BuyService;

public class Address {
    private String street;
    private String number;
    private boolean isApartment;

    public Address(String street, String number, boolean isApartment) {
        this.street = street;
        this.number = number;
        this.isApartment = isApartment;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public boolean isApartment() {
        return isApartment;
    }
}
