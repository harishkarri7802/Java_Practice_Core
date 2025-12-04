package org.example;

//String Expansion: Write a method to expand a compressed string.
public class Week04_28 {
    public static void main(String[] args) {
       String stringValue  = Common.getAnyString("Enter a String : ");
       StringOperation.expandCompressedString(stringValue);
    }
}
