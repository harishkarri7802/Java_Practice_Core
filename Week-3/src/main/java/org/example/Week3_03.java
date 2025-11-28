package org.example;

//Find the largest element in an array.

public class Week3_03 {

    public static void main(String[] args) {
        int array[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("the largest number among the array is : " + ArrayOperation.findTheLargestNumberAmongTheArray(array));
    }
}
