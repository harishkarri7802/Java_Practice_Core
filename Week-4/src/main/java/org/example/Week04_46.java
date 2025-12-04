package org.example;

//Replace Digits with Hashes: Use regex to replace all digits in a string with #.
public class Week04_46 {
    public static void main(String[] args) {
        String stringValue =Common.getStringNumbers("Enter the string and numbers : ");
        StringOperation.regexToReplaceAllDigitInStringWithHash(stringValue);
    }
}
