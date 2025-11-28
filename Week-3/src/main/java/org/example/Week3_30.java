package org.example;

import java.util.Arrays;

//Split an array into two halves.
public class Week3_30 {
    public static void splitArray(int array[]){
        if(array == null) throw new IllegalArgumentException("Array cannot be null ");
        int size =array.length;
        int mid = size/2;
        int firstHalf[]= Arrays.copyOfRange(array,0,mid);
        int secondHalf[] = Arrays.copyOfRange(array,mid,size);
        System.out.println(".....fist half.....");
        ArrayOperation.displayArrayElement(firstHalf);
        System.out.println(".....secound half.....");
        ArrayOperation.displayArrayElement(secondHalf);
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        splitArray(array);
    }
}
