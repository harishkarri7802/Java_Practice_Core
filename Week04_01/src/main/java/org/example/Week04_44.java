package org.example;

import java.time.temporal.ValueRange;

//Extract Words: Write a regex to extract all words from a string (words are separated by spaces).
public class Week04_44 {
    public static void main(String[] args) {
        String sentence = Common.getValidString("Enter a string : ");
        StringOperation.regexToExtractWordsFromString(sentence);
    }
}
