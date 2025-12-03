package org.example;

//Reverse a String: Write a method that takes a string and returns its reverse.
public class Week04_01 {
    public static void main(String[] args) throws InputException {
        String stringValue  = Common.getValidString("Enter string value : ");
        System.out.println("string value : " + stringValue +" and reverse value : " + StringOperation.reverseAString(stringValue));
    }
}
