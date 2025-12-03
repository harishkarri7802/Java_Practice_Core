package org.example;

//Compress a String: Write a method to compress a string by grouping repeated characters.
public class Week04_27 {
    public static void main(String[] args) {
        String stringValue = Common.getValidStringAndNumber("Enter a String : ");
        StringOperation.compressAStringByGroupingRepeatedChar(stringValue);
    }
}
