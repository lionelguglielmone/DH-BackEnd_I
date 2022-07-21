package patternFacade.buyService;

public class ServicePurchase implements ServicePurchaseFacade{
    private StoreHouseService storeHouseService;
    private PaymentService paymentService;
    private DeliveryService deliveryService;

    public ServicePurchase(StoreHouseService storeHouseService, PaymentService paymentService, DeliveryService deliveryService) {
        this.storeHouseService = storeHouseService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    @Override
    public boolean processPurchase(String productId, Integer qty, Card card, Address address) {
        boolean readyToDeliver = false;
        Product p = this.storeHouseService.searchProduct(productId, qty);
        if (p == null){
            System.out.println("Product not found");
        } else {
            boolean paymentAccepted = this.paymentService.processPayment(card, p.getPrice());
            if (!paymentAccepted){
                System.out.println("Payment method rejected");
            } else {
                readyToDeliver = this.deliveryService.processDelivery(p,address);
            }
        }
        return readyToDeliver;


    }
}
