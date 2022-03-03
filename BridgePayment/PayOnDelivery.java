package BridgePayment;

public class PayOnDelivery implements IPayment {

    @Override
    public void pay(int amount, String reason) {
        System.out.println("To Pay: " + amount + " On Delivery for'" + reason + "'");
    }

}
