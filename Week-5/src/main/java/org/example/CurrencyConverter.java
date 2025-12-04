package org.example;

public enum CurrencyConverter {
    UNITED_STATE_DOLLAR("$",1.00),
    INDIAN_RUPEE("IR",89.97),
    CANADIAN_DOLLAR("CD",1.40),
    EURO("EU",0.86);
    private String symbol;
    private double ratioToUSD;
    CurrencyConverter(String symbol, double ratioToUSD) {
        this.symbol=symbol;
        this.ratioToUSD = ratioToUSD;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getRatioToUSD() {
        return ratioToUSD;
    }

    public double converter(double amount,CurrencyConverter targetCurrency){
        if (amount==0) throw new IllegalArgumentException("amount cannot be zero");
        double amountInUSD = amount/this.ratioToUSD;
        return amountInUSD* targetCurrency.ratioToUSD;
    }
}
