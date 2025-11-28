package org.example;

//Copy all elements of one array into another array.

public class Week3_08 {

    public static int[] copyArrayFromAnotherArray(int[] array){
        if(array==null) throw new IllegalArgumentException("Array cannot be null");
        int[] newArray = new int[array.length];
        for(int i =0;i< array.length;i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arrayOne = ArrayOperation.getArrayInputFromUser();
        int[] arrayTwo = copyArrayFromAnotherArray(arrayOne);
        System.out.println("displaying array one : ");
        ArrayOperation.displayArrayElement(arrayOne);
        System.out.println("displaying array two : ");
        ArrayOperation.displayArrayElement(arrayTwo);
   }
}
