package org.example;

//Find all pairs in an array whose sum equals a given number.
public class Week3_42 {
    public static void main(String[] args) {
        int[] arrayOne = ArrayOperation.getArrayInputFromUser();
        int sum = Common.getValidInteger("Enter the sum : ");
        ArrayOperation.findPairofSumEqualToK(arrayOne,sum);
    }
}
