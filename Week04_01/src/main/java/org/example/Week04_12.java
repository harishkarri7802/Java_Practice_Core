package org.example;

//Remove Duplicates: Write a program that removes duplicate characters from a string.
public class Week04_12 {
    public static void main(String[] args) {
      String value  = Common.getValidString("Enter the String value : ");
        System.out.println(value +" after removing duplcate value : " + StringOperation.removeDuplicateCharacter(value));
    }
}
