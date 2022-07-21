package patternFacade.BuyService;

public class Card {
    private String type;
    private String number;
    private String owner;
    private String code;
    private Double moneyAvailable;

    public Card(String type, String number, String owner, String code, Double moneyAvailable) {
        this.type = type;
        this.number = number;
        this.owner = owner;
        this.code = code;
        this.moneyAvailable = moneyAvailable;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public String getCode() {
        return code;
    }

    public Double getMoneyAvailable() {
        return moneyAvailable;
    }
}
