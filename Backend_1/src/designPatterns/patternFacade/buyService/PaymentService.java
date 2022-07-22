package designPatterns.patternFacade.buyService;

public class PaymentService {

    public boolean processPayment(Card card, Double amountToCharge){
        boolean accepted = false;
        if (card.getMoneyAvailable() < amountToCharge){
            System.out.println("You do not have enough money in your account");
        } else {
            accepted = true;
        }
        return accepted;
    }
}
