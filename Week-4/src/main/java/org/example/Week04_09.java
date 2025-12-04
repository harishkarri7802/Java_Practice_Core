package org.example;
import java.util.Arrays;
//Split a String: Split a string into an array of words based on spaces.
public class Week04_09 {
    public static void main(String[] args) throws InputException {
        String sentence = Common.getValidString("Enter a sentence : ");
        System.out.println("Words Dispaly");
        Arrays.stream(StringOperation.splitStringToArrayOfWords(sentence)).forEach( v ->{
            System.out.println(v);
        });
    }
}
