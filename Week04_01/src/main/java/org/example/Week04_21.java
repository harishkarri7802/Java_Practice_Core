package org.example;

//String Contains Check: Write a method to check if one string contains another string as a substring.
public class Week04_21 {
    public static void main(String[] args) {
        String valueOne = Common.getValidString("Enter the String 1 : ");
        String valueTwo = Common.getValidString("Enter the String 2 : ");
        StringOperation.checkStringContainAnotherString(valueOne,valueTwo);
    }
}
