package BankValidationAdapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustom implements CreditCard {

    private BankDetails bankDetails;

    public void sendBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customerName = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accNo = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankName = br.readLine();

            bankDetails = new BankDetails();
            bankDetails.setAccHolderName(customerName);
            bankDetails.setAccNumber(accNo);
            bankDetails.setBankName(bankName);
        } catch (Exception e) {

        }
    }

    public String getCreditCard() {
        long accountNum = bankDetails.getAccNumber();
        String AccountHolderName = bankDetails.getAccHolderName();
        String bname = bankDetails.getBankName();

        return ("The Account number " + accountNum + " of " + AccountHolderName + " in "
                + bname + "bank is valid and authenticated for issuing the credit card.");
    }
}