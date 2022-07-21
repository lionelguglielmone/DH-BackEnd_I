package patternFacade.buyService;

public class StoreHouseService {
    private StoreHouse storeHouse;
    public Product searchProduct(String productId, Integer qty) {
        Product p = this.storeHouse.searchProduct(productId);
        if (p.getQuantity()>=qty){
            //the product is created and both id and quantity are set
            p.setId(productId);
            p.setQuantity(qty);
        }
        return p;
    };


}
