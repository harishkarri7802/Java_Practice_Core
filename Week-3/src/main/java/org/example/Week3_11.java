package org.example;
//Find the second largest element in an array.
public class Week3_11 {
    public static int findSecondLargestElement(int[] array){
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber  = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(firstLargestNumber < array[i]){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = array[i];
            }
        }
        return  secondLargestNumber;
    }
    public static void main(String[] args) {
        int array[] = ArrayOperation.getArrayInputFromUser();
        System.out.println("The Second largest Element in an Array is : " + findSecondLargestElement(array));
    }

}
