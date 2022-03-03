package BridgePayment;

public class order implements IOrder {

    private IPayment payment;
    private int billAmount;
    private String reason;

    public order(int billAmount, IPayment payment, String reason) {
        setBillAmount(billAmount);
        setPayment(payment);
        setReason(reason);
    }

    @Override
    public void pay() {
        payment.pay(billAmount,reason);
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public String getReason(){
        return reason;
    }

    public void setReason(String reason){
        this.reason = reason;
    }


    public IPayment getPayment() {
        return payment;
    }

}
