package org.example;
//Find the intersection of two arrays.

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Week3_26 {
    public static Set<Integer> intersectionOfTwoArrays(int[] arrayOne , int[] arrayTwo) {
        if (arrayTwo == null || arrayOne == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        Set<Integer> intersectElement = new HashSet<>();
        for (int i = 0; i < arrayOne.length; i++) {
            int element = arrayOne[i];
            for (int j = 0; j < arrayTwo.length; j++) {
                if (element == arrayTwo[j]) {
                    intersectElement.add(element);
                }
            }
        }
        return intersectElement;
    }
    public static void main(String[] args) {
        System.out.println("Array One : ");
        int[] arrayOne = ArrayOperation.getArrayInputFromUser();
        System.out.println("Array Two : ");
        int[] arrayTwo = ArrayOperation.getArrayInputFromUser();
        intersectionOfTwoArrays(arrayOne,arrayTwo).stream().forEach(e -> System.out.println("Intersection Elements are : "+e));
    }
}
