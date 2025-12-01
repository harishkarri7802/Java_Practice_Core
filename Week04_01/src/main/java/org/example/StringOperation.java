package org.example;

import java.util.HashMap;
import java.util.Map;

public class StringOperation {

    public static String reverseAString(String string) throws InputException {
        if(string == null) throw new InputException("string not be null");
        String reverseString  = "";
        for(int i=string.length()-1;i>=0;i--){
            reverseString+=string.charAt(i);
        }
        return reverseString;
    }
    public static String converToUpperCase(String value){
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        return value.toUpperCase().trim();
    }
    public static String converToLowerCase(String value){
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        return value.toLowerCase().trim();
    }
    public static String getStringExtraction(String value,int start,int end) throws InputException {
        if (value == null) throw new InputException("String cannot be null");
        if(start > end) throw new InputException("start index cannot be greater then end index ");
        if(start > value.length()-1 || end > value.length() ) throw new InputException("Enter the start index and end index within the string rage.");
        return value.substring(start,end).trim();
    }
    public static String removeWhiteSpaceFromBothSide(String value ) throws InputException {
        if (value == null) throw new InputException("String cannot be null");
        return value.trim();
    }
    public static String[] splitStringToArrayOfWords(String value) throws InputException {
        if (value == null) throw new InputException("String cannot be null");
        return value.split(" ");
    }
    public static String replaceAllOccurenceOfGivenCharacter(String value,char oldCharacter,char newCharacter) throws InputException {
        if (value == null) throw new InputException("String cannot be null");
         return value.replace(oldCharacter,newCharacter).trim();
    }
    public static StringBuffer removeDuplicateCharacter(String value){
        System.out.println("hello------");
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        StringBuffer newValue = new StringBuffer("");
        int[] markCharacter = new int[256];
        for(int i=0;i<value.length();i++){
            if(markCharacter[i] !=0){

            }
            ++markCharacter[i];
            System.out.println(value.charAt(i) + "-----------" + markCharacter[i]);
            newValue.append(value.charAt(i));
        }
        return newValue;
    }

    public static int countNumberOfWordsInString(String value){
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        return value.split(" ").length;
    }

    public static String[] reverseWordsInString(String value) throws InputException {
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        String[] stringArray = value.split(" ");
        for(int i=0;i<stringArray.length;i++){
            stringArray[i] = reverseAString(stringArray[i]);
        }
        return stringArray;
    }

    public static void findFirstNonRepeatCharacterInString(String value){
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        for(int i=0;i<value.length();i++){
            char c = value.charAt(i);
            for(int j=i;j<value.length();j++){

            }

        }
    }

    public static boolean isTwoStringAnagram(String valueOne,String valueTwo){
        if (valueOne==null || valueTwo == null) throw new IllegalArgumentException("String cannot be null");
        if(valueOne.length() != valueTwo.length()){
            return false;
        }
        Map<Character,Integer> valueOneMap = new HashMap<>();
        Map<Character,Integer> valueTwoMap = new HashMap<>();
        for(int i=0;i<valueOne.length();i++){
            char c = valueOne.charAt(i);
            if(valueOneMap.containsKey(c)){
                valueOneMap.put(c,valueOneMap.getOrDefault(c,0)+1);
            }else {
                valueOneMap.put(c,0);
            }
        }
        for(int i=0;i<valueTwo.length();i++){
            char c = valueTwo.charAt(i);
            if(valueTwoMap.containsKey(c)){
                valueTwoMap.put(c,valueTwoMap.getOrDefault(c,0)+1);
            }else {
                valueTwoMap.put(c,0);
            }
        }
        for(int i=0;i<valueOne.length();i++){
            char c = valueOne.charAt(i);
            if(!valueOneMap.containsKey(c) || !valueTwoMap.containsKey(c)){
                return false;
            }
        }
        return true;
    }
    public static String removeCharacterFromString(String value,char character){
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        String answer = "";
        for (int i=0;i<value.length();i++){

            if(value.charAt(i)!=character){
                answer+=value.charAt(i);
            }
        }
        return answer;
    }
    public static void countTheVowelsAndConsonant(String value){
        value.toLowerCase();
        if (value == null) throw new IllegalArgumentException("String cannot be null");
        int vowelsCount =0;
        int consonantCount=0;
        for(int i=0;i<value.length();i++){
            char c = value.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowelsCount++;
            }else {
                consonantCount++;
            }
        }
        System.out.println("String : " + value);
        System.out.println("number of vowels in string : " + vowelsCount);
        System.out.println("number of consonant in string : " + consonantCount);
    }

    public static void checkStringStartWithAndEndWithSpeficString(String value,String startSubString,String endSubString){
        if (value == null || startSubString == null || endSubString==null) throw new IllegalArgumentException("String cannot be null");
        if(!value.startsWith(startSubString)){
             throw new IllegalArgumentException("given substring does not starts with the given string");
        }
        if(!value.endsWith(endSubString)){
            throw new IllegalArgumentException("given substring does not ends with the given string");
        }
        System.out.println("string : " + value);
        System.out.println("start substring : " + startSubString);
        System.out.println("end substring : " + endSubString);
        System.out.println("given starts and ends substring matches with the given string");
    }

    public static void checkStringContainAnotherString(String valueOne ,String valueTwo){
        if (valueOne == null || valueTwo == null) throw new IllegalArgumentException("String cannot be null");
        if(valueOne.contains(valueTwo)){
            System.out.println("String 1 contain String 2 as Substring.....");
            System.out.println("String One : " + valueOne);
            System.out.println("String Two : " + valueTwo);
        }else {
            System.out.println("String 1 contain String 2 as Substring.....");
        }
    }

    public static void countNumberOfCharacterInString(String value){
        if (value == null) throw new IllegalArgumentException("String cannot be null");

    }


}
