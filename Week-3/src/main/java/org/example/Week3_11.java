package org.example;
//Find the second largest element in an array.
public class Week3_11 {

    public static void main(String[] args) {
        int array[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("The Second largest Element in an Array is : " + ArrayOperation.findSecondLargestElement(array));
    }

}
