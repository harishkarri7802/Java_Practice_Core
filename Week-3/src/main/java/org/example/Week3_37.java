package org.example;

//Find the maximum product of two elements in an array.
public class Week3_37 {
    public static void main(String[] args) {
      int[] array = ArrayOperation.getArrayInputFromUser();
      int firstMaxi = ArrayOperation.findTheLargestNumberAmongTheArray(array);
      int secondMaxi = ArrayOperation.findSecondLargestElement(array);
        System.out.println("Maximum product of two numbers are : " + (firstMaxi* secondMaxi));
    }
}
