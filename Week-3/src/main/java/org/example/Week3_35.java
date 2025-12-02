package org.example;

//Find the kth smallest element in an array.
public class Week3_35 {
    public static void main(String[] args) {
      int[] arrayOne= ArrayOperation.getArrayInputFromUser();
      int k = Common.getValidInteger("Enter the kth value : ");
      SortingAlgorithm.selectionSortASC(arrayOne);
        System.out.println("kth smallest value : " + arrayOne[k]);
    }
}
