package org.example;

//Check for Balanced Brackets: Write a function to check if the brackets in a string are balanced (e.g., {}, [], ()).
public class Week04_40 {
    public static void main(String[] args) {
      String stringValue = Common.getValidBrackets("Enter the proper brackets : ");
        System.out.println(stringValue);
        StringOperation.checkBracketsInStringBalanced(stringValue);
    }
}
