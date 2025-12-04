package org.example;

//String to Uppercase: Convert all characters in a string to uppercase.
public class Week04_05 {
    public static void main(String[] args) {
        String value  = Common.getValidString("Enter any String value : ");
        System.out.println(value +" : " + StringOperation.converToUpperCase(value));
    }
}
