package org.example;

//Find All Permutations: Write a program to find all permutations of a given string.
public class Week04_38 {
    public static void main(String[] args) {
        String stringValue = Common.getValidString("Enter a string : ");
        StringOperation.findAllPermutationsOfString(stringValue);
    }
}
