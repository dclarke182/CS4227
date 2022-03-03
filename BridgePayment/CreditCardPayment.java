package BridgePayment;

public class CreditCardPayment implements IPayment {

    @Override
    public void pay(int amount, String reason) {
        System.out.println("Paid: " + amount + " with credit card for '" + reason + "'");
    }

}
