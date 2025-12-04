package pack1;
//Demonstrate the use of default access modifier with classes in the same package.
public class Week2_23 {

    public static void main(String[] args) {
        System.out.println("hello");
        AccountCreation savingAccount = new AccountCreation();
        savingAccount.openAccount(Common.getValidString("Enter your name : "),Common.getValidString("Enter your account type (SAVING?Current) : ") , Common.getValidDouble("Enter your initalBlance : "));

    }

}
