package org.example;

public class Week3_10 {

    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        ArrayOperation.displayArrayElement(array);
        SortingAlgorithm.selectionSortDESC(array);
        System.out.println("After sorting the array ...............");
        ArrayOperation.displayArrayElement(array);
    }
}
