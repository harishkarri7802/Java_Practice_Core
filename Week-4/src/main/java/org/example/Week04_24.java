package org.example;

//Check for Unique Characters: Write a program that checks if a string has all unique characters.
public class Week04_24 {
    public static void main(String[] args) {
        String stringValue= Common.getValidString("Enter the string : ");
        StringOperation.checkStringHasUniqueCharacter(stringValue);
    }
}
