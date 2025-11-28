package org.example;

import java.util.HashMap;
import java.util.Map;

//Find the frequency of each element in an array.
public class Week3_19 {
    public static Map<Integer,Integer> findElementFrequencyInArray(int[] array){
        if(array == null) throw new IllegalArgumentException("array cannot be null ");
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i=0;i<array.length;i++){
            if(frequency.containsKey(array[i])){
                frequency.put(array[i],frequency.getOrDefault(array[i],0)+1);
            }
            else {
                frequency.put(array[i],1);
            }
        }
        return frequency;
    }
    public static void showFrequency(Map<Integer,Integer> frequency){
        if(frequency == null){
            throw new IllegalArgumentException(" fequency cannot be null ");
        }
        for(Map.Entry<Integer,Integer> element : frequency.entrySet()){
            System.out.println(element.getKey() + " : " + element.getValue());
        }
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        showFrequency(findElementFrequencyInArray(array));
    }
}
