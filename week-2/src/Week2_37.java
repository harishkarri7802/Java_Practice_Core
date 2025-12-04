//Implement a class with both parameterized and non-parameterized constructors and show their usage.

import java.util.logging.Level;
import java.util.logging.Logger;

class SBIBankAccount {
    private static final Logger LOGGER = Logger.getLogger(SBIBankAccount.class.getName());

    private String accountHolder;
    private Integer accountNumber;
    private double balance;


    public SBIBankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
        LOGGER.fine("non-parameterized constructors is called.................");
    }


    public SBIBankAccount(String accountHolder, Integer accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        LOGGER.log(Level.FINE,"parameterized constructors is called.................");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}


public class Week2_37 {
    public static void main(String[] args) {


        SBIBankAccount accountOne = new SBIBankAccount();
        System.out.println(accountOne);


        SBIBankAccount accountTwo = new SBIBankAccount(
                Common.getValidString("Enter your name : "),
                Common.getValidInteger("Enter your account no : "),
                Common.getValidDouble("Enter your account balance : "));
        System.out.println(accountTwo);

    }
}
