package org.example;

//Insert Character: Write a function to insert a character at a specific position in a string.
public class Week04_30 {
    public static void main(String[] args) {
        String stringValue = Common.getValidString("Enter a string : ");
        int position = Common.getValidInteger("Enter the position : ");
        char charcter = Common.getValidCharacter("Enter a character you want to insert : ");
        StringOperation.insertCharacterAtSpecificPositionInString(stringValue,position,charcter);
    }
}
