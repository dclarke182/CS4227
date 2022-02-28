package BridgePayment;

public class Payment {
    public static void main(String[] args) {

        IOrder [] bills = new IOrder[] {
                new order(2000, new CreditCardPayment(),"shoes"),
                new order(40000, new CreditCardPayment(),"clothes"),
                new order(200, new PayOnDelivery(),"hat" ),
                new order(400, new PayOnDelivery(),"Gloves")

        };

        for (IOrder order : bills) {
            order.pay();
        }
    }

}
