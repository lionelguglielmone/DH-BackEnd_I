package patternFacade.BuyService;

public class StoreHouseService {
    private StoreHouse storeHouse;
    public Product searchProduct(String productId, Integer qty) {
        Product p = this.storeHouse.searchProduct(productId);
        return p;
    };


}
