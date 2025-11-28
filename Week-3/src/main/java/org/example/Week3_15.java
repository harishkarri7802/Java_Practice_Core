package org.example;

// Shift all elements of an array one position to the left.
public class Week3_15 {

    public static void shiftElementLeftPositionByOne(int array[]) {
        if(array == null) throw new IllegalArgumentException("array cannot be null");
        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        shiftElementLeftPositionByOne(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
