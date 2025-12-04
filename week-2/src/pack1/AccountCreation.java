package pack1;


import java.util.logging.Level;
import java.util.logging.Logger;

//default class
class AccountCreation {
    private static String customerName;
    private static String customerAccountType;
    private static Double initialbalance;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AccountCreation.class));

    public void openAccount(String customerName,String customerAccountType,Double initialbalance){
        AccountValidation validation = new AccountValidation();
        validation.validAccount(customerName,customerAccountType,initialbalance);

        LOGGER.log(Level.INFO , "Account is created Successfully............");

    }


}
