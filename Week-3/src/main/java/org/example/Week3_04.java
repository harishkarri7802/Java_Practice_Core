package org.example;
//Find the smallest element in an array.
public class Week3_04 {

    public static int findTheSmallestNumberAmongTheArray(int[] array){
        if(array==null) throw new IllegalArgumentException("Array cannot be null");
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int[] array  = ArrayOperation.getArrayInputFromUser();
        System.out.println("the smallest number among the array is : " + findTheSmallestNumberAmongTheArray(array));

    }

}
