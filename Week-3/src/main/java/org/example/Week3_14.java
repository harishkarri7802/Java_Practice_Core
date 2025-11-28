package org.example;
//Remove duplicate elements from an array.

import java.util.HashSet;
import java.util.Set;

public class Week3_14 {
    public static int[] removeDuplicateElementFromArray(int[] array){

        Set<Integer> uniqueSet = new HashSet<>();
        for(int i=0;i<array.length ;i++){
            uniqueSet.add(array[i]);
        }
        int newArray[] = new int[uniqueSet.size()];
        int i=0;
        for (int element : uniqueSet){
            newArray[i] =element;
            i++;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int array[] = ArrayOperation.getArrayInputFromUser();
        int[] uniqueArray = removeDuplicateElementFromArray(array);
        ArrayOperation.displayArrayElement(uniqueArray);
    }
}
