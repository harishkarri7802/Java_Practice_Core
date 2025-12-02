package org.example;

//Rotate an array by a given number of positions to the left.
public class Week3_24 {
    public static void rotateArrayByPosition(int[] array,int position){
        if(array ==null){
            throw new IllegalArgumentException("Array cannot be null");
        }
        if(position==0) return;
        int[] halfArray = new int[position];
        for(int i=0;i<position;i++){
            halfArray[i] = array[i];
        }
        for(int i=0;i<array.length;i++){
            array[i]= array[position+i];
        }
    }
    public static void main(String[] args) {
        int arrayOne[] = ArrayOperation.getArrayInputFromUser();
        ArrayOperation.displayArrayElement(arrayOne);
        int position = Common.getValidInteger("Enter the position : ");
        rotateArrayByPosition(arrayOne,position);
        ArrayOperation.displayArrayElement(arrayOne);
    }
}
