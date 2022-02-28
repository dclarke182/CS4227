package BridgePayment;

public interface IPayment {

    /**
     * Pay the specified amount.
     */
    public void pay(int amount, String reason);

}