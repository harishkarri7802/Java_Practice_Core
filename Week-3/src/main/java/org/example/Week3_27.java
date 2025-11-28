package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Find the union of two arrays.
public class Week3_27 {
    public static List<Integer> unionOfTwoArrays(int[] arrayOne, int[] arrayTwo){
        if(arrayOne == null || arrayTwo==null) throw new IllegalArgumentException("Array cannot be null...");
        Set<Integer> unionArray = new HashSet<>();
        for(int i=0;i<arrayOne.length;i++){
            unionArray.add(arrayOne[i]);
        }
        for(int i=0;i<arrayTwo.length;i++){
            unionArray.add(arrayTwo[i]);
        }
        return unionArray.stream().toList();
    }
    public static void main(String[] args) {
        System.out.println("For Array 1: ");
        int arrayOne[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("For Array 2: ");
        int arrayTwo[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("Union Array : ");
        unionOfTwoArrays(arrayOne,arrayTwo).stream().forEach(element-> System.out.println(element));

    }
}
