//Demonstrate the order of execution between static blocks, instance blocks, and constructors.
class AxisBankAccount {

    static int counter = 0;

    // Static Block 1
    static {
        System.out.println("AxisBankAccount: Static Block 1");
    }

    // Static Block 2
    static {
        System.out.println("AxisBankAccount: Static Block 2");
    }

    // Instance Block 1
    {
        System.out.println("AxisBankAccount: Instance Block 1");
    }

    // Instance Block 2
    {
        System.out.println("AxisBankAccount: Instance Block 2");
    }


    public AxisBankAccount() {
        System.out.println("AxisBankAccount: Default Constructor");
    }


    public AxisBankAccount(int id) {
        System.out.println("AxisBankAccount: Parameterized Constructor (id = " + id + ")");
    }
}


class SavingsAccount extends AxisBankAccount {

    static double rate;

    // Static Block 1
    static {
        rate = 6.5;
        System.out.println("SavingsAccount: Static Block 1 (rate = " + rate + ")");
    }

    // Static Block 2
    static {
        System.out.println("SavingsAccount: Static Block 2");
    }

    // Instance Block 1
    {
        System.out.println("SavingsAccount: Instance Block 1");
    }

    // Instance Block 2
    {
        System.out.println("SavingsAccount: Instance Block 2");
    }


    public SavingsAccount() {
        super();
        System.out.println("SavingsAccount: Default Constructor");
    }

    public SavingsAccount(int id) {
        super(id);
        System.out.println("SavingsAccount: Parameterized Constructor (id = " + id + ")");
    }
}


public class Week2_38 {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount();


        SavingsAccount s2 = new SavingsAccount(101);
    }


}
