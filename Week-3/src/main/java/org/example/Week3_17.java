package org.example;
//Insert an element at a specific position in an array.
public class Week3_17 {
    public static void insertElementAtSpecficPosition(int arr[],int position,int value){
        if(arr == null) throw new IllegalArgumentException("array cannot be null.....");
        arr[position] =value;
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        int position = Common.getValidInteger("Enter the position : ");
        int value = Common.getValidInteger("Enter the value : ");
        insertElementAtSpecficPosition(array,position,value);
        ArrayOperation.displayArrayElement(array);
    }
}
