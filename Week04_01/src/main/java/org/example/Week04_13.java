package org.example;

//Count Words: Count the number of words in a string.
public class Week04_13 {
    public static void main(String[] args) {
        String sentence  = Common.getValidString("Enter the any sentence : ");
        System.out.println("number of words in the sentence : " + StringOperation.countNumberOfWordsInString(sentence));
    }
}
