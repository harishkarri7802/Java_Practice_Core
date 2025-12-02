package org.example;

//Find the largest element in an array.

public class Week3_03 {
    public static int findTheLargestNumberAmongTheArray(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int array[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("the largest number among the array is : " + findTheLargestNumberAmongTheArray(array));
    }
}
