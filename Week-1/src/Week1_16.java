//Create a program that converts an amount from one currency to another (e.g., USD to INR) using a predefined conversion rate.

class CurrencyConverter{

    public static double toINR(double amount){
        return 89.15* amount;
    }

    public static double toUSD(double amount){
        return 0.011 * amount;
    }


}



public class Week1_16 {

    public static void main(String[] args) {

        System.out.println(CurrencyConverter.toINR(2));

    }

}
