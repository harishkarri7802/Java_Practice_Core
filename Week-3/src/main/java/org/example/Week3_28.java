package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Find the difference between two arrays (elements in the first array but not in the second).
public class Week3_28 {
    public static int[] differenceInTwoArrays(int[] arrayOne,int[] arrayTwo){
        if(arrayOne == null || arrayTwo==null) throw new IllegalArgumentException("Array Cannot be null");
        Set<Integer> arrayElement = new HashSet<>();
        for(int i=0;i<arrayOne.length ; i++){
            for(int j=0;j<arrayTwo.length;j++){
                if(arrayOne[i] == arrayTwo[j] ){
                    break;
                }
                arrayElement.add(arrayOne[i]);
            }
        }
        int[] newArray = new int[arrayElement.size()];
        arrayElement.stream().forEach(e->{
            int i=0;
            newArray[i] = e;
            i++;
        });
        return newArray;
    }
    public static void main(String[] args) {
        System.out.println("Array One ");
        int arrayOne[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("Array Two ");
        int arraytwo[] = ArrayOperation.getArrayInputFromUser();
        int diff[] = differenceInTwoArrays(arrayOne,arraytwo);
        ArrayOperation.displayArrayElement(diff);
    }
}
