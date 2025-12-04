package org.example;

//Write a program to count the occurrences of each character in a string using a HashMap.
// Output the result in the format: Character: Count.
public class Week05_05 {
    public static void main(String[] args) {
        String string = Common.getValidString("Enter a string : ");
        Operations.countFrequenceOfCharacterInString(string);
    }
}
