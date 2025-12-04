package org.example;

//Check Subsequence: Write a function to check if one string is a subsequence of another.
public class Week04_29 {
    public static void main(String[] args) {
        String stringOne = Common.getValidString("Enter a string 1 : ");
        String stringTwo = Common.getValidString("Enter a string 1 : ");
        boolean i =StringOperation.checkStringIsASubsquenceOfAnotherString(stringOne,stringTwo);
        System.out.println(i);
    }
}
