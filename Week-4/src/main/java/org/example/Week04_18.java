package org.example;

//Character Removal: Remove a specific character from a string.
public class Week04_18 {
    public static void main(String[] args) {
        String valueOne = Common.getValidString("Enter the String : ");
        char toremoveCharacter = Common.getValidCharacter("Enter the character");
        System.out.println("value : "+valueOne +" : character : " + toremoveCharacter + " after removing character : " + StringOperation.removeCharacterFromString(valueOne,toremoveCharacter));
    }
}
