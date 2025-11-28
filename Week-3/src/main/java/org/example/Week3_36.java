package org.example;
//Find the contiguous subarray with the largest sum (Kadane’s Algorithm).
public class Week3_36 {
    public static int largestSubArraySum(int array[]){
        if(array == null) throw new IllegalArgumentException("Array cannot be null");
        int currentMax = 0;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            currentMax+=max;
            if(currentMax<0){
                currentMax=0;
            }
            if(currentMax>max){
                max = currentMax;
            }
        }
        return max;
    }
    public static void main(String[] args) {
            int array[] = ArrayOperation.getArrayInputFromUser();
            System.out.println("largest sum in contiguous subarray is : "+ largestSubArraySum(array));
    }
}
