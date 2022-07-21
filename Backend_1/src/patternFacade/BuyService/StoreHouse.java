package patternFacade.BuyService;

import java.util.ArrayList;

public class StoreHouse {

    private ArrayList<Product> products;

    public StoreHouse(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p){
        this.products.add(p);
    }

    public void removeProduct(Product p){
        this.products.remove(p);
    }

    public Product searchProduct(String id){
        Product product = null;
        for (Product p: this.products){
            if (p.getId().equals(id)){
                product = p;
            }
        }
        return product;
    }
}
