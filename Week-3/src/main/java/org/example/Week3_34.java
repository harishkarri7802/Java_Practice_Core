package org.example;
//Find the kth largest element in an array.
public class Week3_34 {
    public static int kthLargestNumber(int array[],int key){
        if (array==null) throw new IllegalArgumentException("Array cannot be null");
        if(key>array.length) throw new IllegalArgumentException("k value cannot be greater then array size.");
        return array[key-1];
    }
    public static void main(String[] args) {
        int array[] = ArrayOperation.getArrayInputFromUser();
        SortingAlgorithm.selectionSortDESC(array);
        ArrayOperation.displayArrayElement(array);
        System.out.println("kth largest number is : " + kthLargestNumber(array,Common.getValidInteger("Enter the kth number : ")));
    }
}
