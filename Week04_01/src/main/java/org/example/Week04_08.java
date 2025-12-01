package org.example;

//Remove Whitespace: Remove all leading and trailing whitespaces from a string.
public class Week04_08 {
    public static void main(String[] args) throws InputException {
        String value   = Common.getValidString("Enter the String Value : ");
        System.out.println(value + " after removing white space : " + StringOperation.removeWhiteSpaceFromBothSide(value));
    }
}
