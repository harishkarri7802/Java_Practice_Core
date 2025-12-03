package org.example;
//String to Lowercase: Convert all characters in a string to lowercase.
public class Week04_06 {
    public static void main(String[] args) {
       String value = Common.getValidString("Enter the String value : ");
        System.out.println(value + " : " + StringOperation.converToLowerCase(value));
    }
}
