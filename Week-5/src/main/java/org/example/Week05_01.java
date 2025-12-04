package org.example;

//Create a program that reads a paragraph of text and uses a HashMap to count the frequency of each word.
// Display the word and its count in descending order of frequency.
public class Week05_01 {
    public static void main(String[] args) {
      String sentence  = Common.getValidString("Enter a sentence : ");
      Operations.countFrequenceOfWorldInString(sentence);
    }
}
