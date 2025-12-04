package org.example;

//Count Occurrences of Substring: Count how many times a specific substring appears in a string.
public class Week04_39 {
    public static void main(String[] args) {
        String stringValue = Common.getValidString("Enter a string : ");
        String substring = Common.getValidString("Enter a substring : ");
        StringOperation.countSubstringInString(stringValue,substring);
    }
}
