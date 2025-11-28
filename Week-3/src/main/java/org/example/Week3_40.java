package org.example;

//Check if an array is sorted in descending order.
public class Week3_40 {
    public static boolean isArraySorted(int[] array){
        if(array==null) throw new IllegalArgumentException("Array cannot be null");
        for(int i=0;i<array.length-1;i++){
            if(array[i] < array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        if(isArraySorted(array)){
            System.out.println("array is sorted as descending order.....");
        }else {
            System.out.println("array is not sorted as descending order....");
        }
    }
}
