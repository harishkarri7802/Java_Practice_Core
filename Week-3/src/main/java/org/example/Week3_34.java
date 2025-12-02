package org.example;

//Find the kth largest element in an array.
public class Week3_34 {
    public static void main(String[] args) {
        int[] arrayOne= ArrayOperation.getArrayInputFromUser();
        SortingAlgorithm.selectionSortDESC(arrayOne);
        int key = Common.getValidInteger("Enter the k value : ");
        System.out.println("kth largest number is : " + arrayOne[key]);
    }
}
