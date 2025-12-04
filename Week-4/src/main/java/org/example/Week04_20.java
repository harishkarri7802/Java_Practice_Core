package org.example;

//String Starts/Ends Check: Write a program to check if a string starts with a specified substring and ends with another substring.
public class Week04_20 {
    public static void main(String[] args) {
        String valueOne = Common.getValidString("Enter the String : ");
        String startSubString = Common.getValidString("Enter the String : ");
        String endSubString = Common.getValidString("Enter the String : ");
        StringOperation.checkStringStartWithAndEndWithSpeficString(valueOne,startSubString,endSubString);
    }
}
