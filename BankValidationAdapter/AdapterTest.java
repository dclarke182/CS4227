package BankValidationAdapter;

public class AdapterTest {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustom();
        targetInterface.sendBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
