package org.example;

//Reverse the elements of an array.

public class Week3_05 {

    public static void reverseAnArray(int[] array){
        int firstIndex = 0;
        int lastIndex = array.length-1;
        while(firstIndex < lastIndex){
            int temp = array[firstIndex];
            array[firstIndex] = array[lastIndex];
            array[lastIndex]  = temp;
            firstIndex++;
            lastIndex--;
        }
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        reverseAnArray(array);
        ArrayOperation.displayArrayElement(array);
    }

}
