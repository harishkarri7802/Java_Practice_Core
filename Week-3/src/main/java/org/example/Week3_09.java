package org.example;
//Sort an array in ascending order (using any sorting algorithm).

public class Week3_09 {
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        ArrayOperation.displayArrayElement(array);
        SortingAlgorithm.selectionSortASC(array);
        System.out.println("After sorting the array ...............");
        ArrayOperation.displayArrayElement(array);
    }
}
