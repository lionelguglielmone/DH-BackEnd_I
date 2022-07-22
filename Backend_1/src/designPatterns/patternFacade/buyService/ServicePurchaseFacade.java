package designPatterns.patternFacade.buyService;

public interface ServicePurchaseFacade {

    boolean processPurchase(String productId, Integer qty, Card card, Address address);
}
