package pack1;


import java.math.BigDecimal;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountValidation {
//    private static Scanner sc = new Scanner(System.in);
    private static final Double MIN_INITIAL_BALANCE=3000.00;
    private static final Logger LOGGER = Logger.getLogger(AccountValidation.class.getName());



    public boolean validAccount(String customerName,String customerAccountType,Double initialbalance){

        if(!validString(customerName) || !validAccountType(customerAccountType) || !validInitialBalance(initialbalance)){
            throw new IllegalArgumentException("Account cannot be created.....");
        }
        return false;
    }

    public boolean validAccountType(String accountType){
        if(accountType==null || accountType.isEmpty() || accountType.isBlank()){
            return false;
        }
        String verifyType= accountType.toUpperCase();

        LOGGER.log(Level.INFO,verifyType);

        if(!validString(accountType)){
            return false;
        }
        if(!verifyType.equals("SAVING") || !verifyType.equals("CURRENT")){
            throw new IllegalArgumentException("Account Type is wrong . you should type either currrent account or saving account ....");
        }
        return true;
    }


    public static boolean validInitialBalance(Double initialbalance){
        if(initialbalance < MIN_INITIAL_BALANCE){
            throw new IllegalArgumentException("initialbalance should grater then 3000");
        }
        return true;


    }



    public static boolean validString(String data) {
        while (true) {
            try {
                System.out.println(data);


                if (!data.matches("[a-zA-Z ]+")) {
                    throw new CustomException("Only alphabets allowed!");
                }
                return true;

            } catch (CustomException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }


}
