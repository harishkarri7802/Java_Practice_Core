package org.example;
//Merge two arrays into a single array.

public class Week3_13 {
    public static int[] mergeTwoArray(int[] arrayOne,int[] arrayTwo){
        if(arrayOne==null || arrayTwo==null) throw new IllegalArgumentException("Array cannot be null");

        int[] newArray = new int[arrayOne.length + arrayTwo.length];
        for(int i =0;i<arrayOne.length;i++){
            newArray[i] = arrayOne[i];
        }
        System.out.println("--------------------");
        ArrayOperation.displayArrayElement(newArray);
        System.out.println("--------------------");
        for(int i=arrayOne.length -1 ;i<arrayTwo.length;i++){
            newArray[i] = arrayTwo[i];
        }
        System.out.println("--------------------");
        ArrayOperation.displayArrayElement(newArray);
        System.out.println("--------------------");
        return newArray;
    }
    public static void main(String[] args) {
        System.out.println("Array One Info ............");
        int[] arrayOne = ArrayOperation.getArrayInputFromUser();
        System.out.println("Array two Info ............");
        int[] arrayTwo = ArrayOperation.getArrayInputFromUser();
        int[] arrayThree = mergeTwoArray(arrayOne,arrayTwo);
        ArrayOperation.displayArrayElement(arrayThree);
    }
}
