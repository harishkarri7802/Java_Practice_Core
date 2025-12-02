package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ArrayOperation {

    public static int findTheLargestNumberAmongTheArray(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
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
    public static int findThirdLargestElement(int[] array){
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber  = Integer.MIN_VALUE;
        int thirdLargestNumber  = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(firstLargestNumber < array[i]){
                thirdLargestNumber=secondLargestNumber;
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = array[i];
            }
        }
        return  thirdLargestNumber;
    }
    private ArrayOperation(){}
    public static int[] getArrayInputFromUser(){
        System.out.println("Array creation......");
        System.out.println();
        int numberOfElement = Common.getValidInteger("Enter the size of an array : ");
        int array[] = new int[numberOfElement];
        for(int i=0;i<numberOfElement;i++){
            array[i] = Common.getValidInteger("Enter the element " + i +" : ");
        }
        return array;
    }
    public static void displayArrayElement(int[] array){
         for(int i=0;i<array.length;i++) {
             System.out.println("Element " + i + " :" + array[i]);
         }
    }

    public static boolean checkArrayIsPalindrme(int[] array){
        if(array==null) throw new IllegalArgumentException("array cannot be null");

        int start = 0;
        int end = array.length-1;
        while(start < end){
            if(array[start] != array[end]){
                return false;
            }
        }
        return true;
    }

    public static void splitArray(int[] array){
        if(array==null){
            throw new IllegalArgumentException("Array cannot be null");
        }
        int n = array.length /2;
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[(array.length-n)+1];
        for(int i=0;i<n;i++){
            firstHalf[i] =array[i];
        }
        for(int i=n+1;i<array.length;i++){
            secondHalf[n-i] = array[i];
        }
        System.out.println("First Half ");
        ArrayOperation.displayArrayElement(firstHalf);
        System.out.println("Second Half ");
        ArrayOperation.displayArrayElement(secondHalf);
    }
    public static void isArrayIsSortedInDSC(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        for(int i=0;i< arrayOne.length-1;i++){
            if(arrayOne[i]>arrayOne[i+1]){
                System.out.println("arrays is sorted in descending order");
                return;
            }
        }
        System.out.println("arrays is not  sorted in descending order");
    }
    public static void isArrayIsSortedInASC(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        for(int i=0;i< arrayOne.length;i++){
            if(arrayOne[i]<arrayOne[i+1]){
                System.out.println("arrays is sorted in ascending order");
                return;
            }
        }
        System.out.println("arrays is not  sorted in ascending order");
    }
    public static void findMaximumProductOfThreeNumber(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        System.out.println("maximun product of three number are : " + (findSecondLargestElement(arrayOne)*findThirdLargestElement(arrayOne)*findTheLargestNumberAmongTheArray(arrayOne)));
    }

    public static void findMaximumProductOfTwoNumber(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        System.out.println("maximun product of two number are : " + (findSecondLargestElement(arrayOne)*findTheLargestNumberAmongTheArray(arrayOne)));


    }
    public static void findLargestSumInSubArray(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        int currentMax=0;
        int maxSum=0;
        for(int i=0;i<arrayOne.length;i++){
            currentMax+=arrayOne[i];
            maxSum = Math.max(currentMax,maxSum);
            if(currentMax<0){
                currentMax=0;
            }
        }
        System.out.println("largest maximum sum : " + maxSum);
    }
    public static void findLongestConsecutiveSeq(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        Set<Integer> set = new HashSet<>();

        for(int s:arrayOne){
            set.add(s);
        }
        int maxLength=0;
        for(int number:set){
            if(!set.contains(number-1)){
                int currentElement = number;
                int currentLength=0;
                while(set.contains(number+1)){
                    ++currentLength;
                    ++currentElement;
                }
                Math.max(currentLength,maxLength);
            }
        }
        System.out.println("max consecutive sequence length : "+ maxLength);
    }
    public static void moveAllZeroesToLast(int[] arrayOne) {
    }
    public static void findPairofSumEqualToK(int[] arrayOne,int sum) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        Set<Integer> set = new HashSet<>();
        for(int i : arrayOne){
            set.add(i);
        }
        List<int[]> answerPair = new ArrayList<>();
        for (int i=0;i<arrayOne.length;i++){
            int target = sum- arrayOne[i];
            if(set.contains(target)){
                answerPair.add(new int[]{target,arrayOne[i]});
            }
        }
        answerPair.stream().forEach(ans->{
            int i=0;
            System.out.println(ans[i]);
            i++;
        });
    }
    public static void findMiniNumberSwapNeedToSort(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        int minimumNumberToSwap =0;
        for(int i =0;i<arrayOne.length;i++){
            for(int j=0;j<arrayOne.length;j++){
                if(arrayOne[j]>arrayOne[j+1]){
                    int temp=arrayOne[j];
                    arrayOne[j] = arrayOne[i];
                    arrayOne[i] = temp;
                    ++minimumNumberToSwap;
                }
            }
        }
    }
    public static int findTheSmallestNumberAmongTheArray(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void findMaximumDiffrenceBetweenTwoElement(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        System.out.println("Maximum diffrence between two number : " + (findTheLargestNumberAmongTheArray(arrayOne)-findTheSmallestNumberAmongTheArray(arrayOne)));
    }
    public static void findLargestElementInRotatedArray(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        int left = 0;
        int right = arrayOne.length;
        while(left<right){
            if(arrayOne[left] < arrayOne[right]) {
                System.out.println("largest number : " + arrayOne[right]);
                return;
            }
            int mid =(left + (right - left)) /2;
            if(arrayOne[mid] >arrayOne[right]){
                left  = mid+1;
            }else {
                right = mid;
            }
        }
        System.out.println("largest number : " + arrayOne[((left-1) + arrayOne.length ) % arrayOne.length]);
    }
    public static void findMajorityElementInArray(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        int counter=0;
        int candidate=arrayOne[0];
        for(int i=0;i<arrayOne.length;i++){
            if(candidate == arrayOne[i]){
                ++counter;
            }else{
                --counter;
                if(counter==0){
                    candidate =arrayOne[i];
                }
            }
        }
        int againCount=0;
        for (int ele : arrayOne){
            if (ele == candidate){
                ++againCount;
            }
        }
        System.out.println(againCount);
        if(againCount>arrayOne.length/2){
            System.out.println("majority element : " + candidate);
        }else {
            System.out.println("no majority element");
        }
    }
    public static void findMedianOfUnsortedArray(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        SortingAlgorithm.selectionSortASC(arrayOne);
        int size  = arrayOne.length;
        if(size%2==0){
            System.out.println("Median is : ");
            int median = (size/2);
            System.out.println(median);
        }else {
            System.out.println("Median is : ");
            int median = ((size/2)-1)+ (size/2);
            System.out.println(median);
        }
    }
    public static void findCommonElementsFromThreeSortedArray(int[] arrayOne,int[] arrayTwo,int[] arrayThree) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
        int i=0;
        int j=0;
        int k=0;
    }

    public static void findSmallestElementInSortedArray(int[] arrayOne) {
        if(arrayOne==null)throw new IllegalArgumentException("array cannot be null");
         int left = 0;
         int right = arrayOne.length-1;

         while(left < right){
             int mid  =( left + (right-left) )/2;

             if(arrayOne[mid] > arrayOne[right]){
                 left = mid+1;
             }else {
                 right=mid;
             }
         }
        System.out.println("smallest element : "+ arrayOne[left]);
    }
}
