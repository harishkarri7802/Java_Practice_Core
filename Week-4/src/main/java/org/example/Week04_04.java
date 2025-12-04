package org.example;

//String Concatenation: Concatenate two strings without using the + operator.
public class Week04_04 {
    public static void main(String[] args) {
      String stringOne  = Common.getValidString("Enter the String 1 : ");
      String stringTwo = Common.getValidString("Enter the String 2 : ");
        System.out.println("joint string is : " + stringOne.concat(stringTwo));
    }
}
