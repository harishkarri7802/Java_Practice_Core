package org.example;

import java.util.HashMap;
import java.util.Map;

//Character Frequency Count: Count the frequency of each character in a given string.
public class Week04_03 {
    public static Map<Character,Integer> getThefrequencyOfCharacterInstring(String value) throws InputException {
        if (value == null) throw new InputException("String cannot be null");
        Map<Character,Integer> frequencymap = new HashMap<>();
        for(int i=0;i<value.length();i++){
            char character = value.charAt(i);
            if(!frequencymap.containsKey(character)){
               frequencymap.put(character,0);
            }
            frequencymap.put(character,frequencymap.getOrDefault(character,0)+1);
        }
      return frequencymap;
    }
    public static void main(String[] args) throws InputException {
        String value = Common.getValidString("Enter the String value  : ");
        getThefrequencyOfCharacterInstring(value).entrySet().stream().forEach((k)->{
            System.out.println(k);
        });
    }
}
