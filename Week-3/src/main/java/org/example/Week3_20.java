package org.example;

import java.util.HashMap;
import java.util.Map;

//Find the most frequent element in an array.
public class Week3_20 {
    public static int findTheMostFrequentElementInArray(Map<Integer,Integer> frequency){
        if(frequency == null) throw new IllegalArgumentException("frequency cannnot be null");
        int currentMaxElement = 0;
        int currentMaxShownCount = 0;
        for(Map.Entry<Integer,Integer> element : frequency.entrySet()){
            if(currentMaxShownCount < element.getValue()){
                currentMaxElement = element.getKey();
                currentMaxShownCount = element.getValue();
            }
            System.out.println(element.getKey() + " : " + element.getValue());
        }
        return currentMaxElement;
    }
    public static void main(String[] args) {
          int[] array = ArrayOperation.getArrayInputFromUser();
          Map<Integer,Integer> frequency =  MapOperation.findElementFrequencyInArray(array);
//          MapOperation.showFrequency(frequency);
          System.out.println("Maximum shown element in the array is : " + findTheMostFrequentElementInArray(frequency));
    }
}
