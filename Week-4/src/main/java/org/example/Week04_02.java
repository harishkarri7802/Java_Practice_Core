package org.example;

//Palindrome Check: Create a function to check if a given string is a palindrome.
public class Week04_02 {
    public static boolean isStringPalindrome(String value) throws InputException {
        if (value == null) throw new InputException("string cannot be null");
        String reverseString = StringOperation.reverseAString(value);
        if(!value.equals(reverseString)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws InputException {
        String value  = Common.getValidString("Enter a string value : ");
        String message = (isStringPalindrome(value))?"string is palindrome ":"string is not a palindrome";
        System.out.println(value + ": " + message);
    }
}

