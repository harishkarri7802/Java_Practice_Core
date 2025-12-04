package org.example;

//Extract Digits: Write a regex to extract all digits from a string.
public class Week04_45 {
    public static void main(String[] args) {
        String sentence = Common.getValidString("Enter a string : ");
        StringOperation.regexToExtractDigitsFromString(sentence);
    }
}
