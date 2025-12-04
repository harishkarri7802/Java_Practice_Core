package org.example;

import java.util.Arrays;

//Reverse Each Word: Reverse each word in a sentence while keeping the word order intact.
public class Week04_14 {
    public static void main(String[] args) throws InputException {
       String sentence  = Common.getValidString("Enter any sentence : ");
        System.out.println(" sentence : " +sentence );
        Arrays.stream(StringOperation.reverseWordsInString(sentence)).forEach(e->
                System.out.println(e));
    }
}
