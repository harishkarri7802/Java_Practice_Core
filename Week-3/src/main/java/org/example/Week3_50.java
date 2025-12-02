package org.example;

//Find the common elements in three sorted arrays.
public class Week3_50 {
    public static void main(String[] args) {
        System.out.println("Array 1 :");
       int[] arrayOne = ArrayOperation.getArrayInputFromUser();
        System.out.println("Array 2 :");
       int[] arrayTwo = ArrayOperation.getArrayInputFromUser();
        System.out.println("Array 3 :");
       int[] arrayThree = ArrayOperation.getArrayInputFromUser();
       ArrayOperation.findCommonElementsFromThreeSortedArray(arrayOne,arrayTwo,arrayThree);
    }
}
