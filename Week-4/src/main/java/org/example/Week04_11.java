package org.example;

//String Replacement: Replace all occurrences of a character in a string with another character.
public class Week04_11 {

    public static void main(String[] args) throws InputException {
        String stringValue = Common.getValidString("Enter the String value : ");
        char oldChar = Common.getValidCharacter("Enter the character you want to replace : ");
        char newChar = Common.getValidCharacter("Enter the new Character you want to see : ");
        System.out.println("old Value :" + stringValue);
        System.out.println("new Value :" + StringOperation.replaceAllOccurenceOfGivenCharacter(stringValue,oldChar,newChar));
    }
}
