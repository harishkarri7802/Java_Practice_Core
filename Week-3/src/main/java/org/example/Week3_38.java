package org.example;

//Find the maximum product of three elements in an array.
public class Week3_38 {
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        int firstMaxi = ArrayOperation.findTheLargestNumberAmongTheArray(array);
        int secoundMaxi  = ArrayOperation.findSecondLargestElement(array);
        int thirdMaxi = ArrayOperation.findThirdLargestElement(array);
        System.out.println("Product of three numbers are : " + (firstMaxi * secoundMaxi * thirdMaxi));
    }
}
