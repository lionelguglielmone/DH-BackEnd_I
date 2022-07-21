package patternFacade.BuyService;

public class Product {
    private String id;
    private Integer quantity;
    private Double price;

    public Product(String id, Integer quantity, Double price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setId(String id) {
        this.id = id;
    }
}
