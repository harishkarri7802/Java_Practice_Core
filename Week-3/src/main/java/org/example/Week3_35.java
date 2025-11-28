package org.example;
//Find the kth smallest element in an array.
public class Week3_35 {
    public static int kthSmallestNumber(int array[],int key){
        if (array==null) throw new IllegalArgumentException("Array cannot be null");
        if(key>array.length) throw new IllegalArgumentException("k value cannot be greater then array size.");
        return array[key-1];
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        SortingAlgorithm.selectionSortASC(array);
        ArrayOperation.displayArrayElement(array);
        System.out.println("kth largest number is : " + kthSmallestNumber(array,Common.getValidInteger("Enter the kth number : ")));
    }
}
