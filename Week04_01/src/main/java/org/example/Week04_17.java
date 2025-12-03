package org.example;

//Anagram Check: Write a function to check if two strings are anagrams.
public class Week04_17 {
    public static void main(String[] args) {
        String valueOne = Common.getValidString("Enter the String 1 : ");
        String valueTwo = Common.getValidString("Enter the String 2 : ");
        if(StringOperation.isTwoStringAnagram(valueOne,valueTwo)){
            System.out.println("Two string are anagrams");
        }else {
            System.out.println("Two string are not anagrams");
        }
    }
}
