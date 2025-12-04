package org.example;

//Implement a currency converter using an enum to represent different currencies and their conversion rates.
public class Week05_13 {
    public static void main(String[] args) {
       CurrencyConverter converter = CurrencyConverter.UNITED_STATE_DOLLAR;
       converter.getRatioToUSD();
       double rupee = converter.converter(100,CurrencyConverter.INDIAN_RUPEE);
        System.out.println(rupee);
    }
}
