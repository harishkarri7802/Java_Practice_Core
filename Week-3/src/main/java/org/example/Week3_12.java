package org.example;

public class Week3_12 {

    public static int findSecondSmallestElement(int[] array){
        if(array==null) throw new IllegalArgumentException("Array cannot be null");
        int firstSmallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber  = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(firstSmallestNumber > array[i]){
                secondSmallestNumber = firstSmallestNumber;
                firstSmallestNumber = array[i];
            }
        }
        return  secondSmallestNumber;
    }
    public static void main(String[] args) {
        int array[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("The Second Smallest Element in an Array is : " + findSecondSmallestElement(array));
    }
}
