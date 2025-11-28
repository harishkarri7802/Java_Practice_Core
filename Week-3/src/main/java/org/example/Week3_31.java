package org.example;
//Find the missing number in an array of 1 to n.
public class Week3_31 {
    public static int missingNumber(int[] array){
        if(array==null) throw new IllegalArgumentException("Array cannot be null");
        int sizeOfArray = array.length;
        int sum = (sizeOfArray * (sizeOfArray + 1))/2;
        for (int i=0;i<array.length;i++){
            sum-=array[i];
        }
        if(sum==0) {
            System.out.println("zero missing number ");
            return 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        System.out.println("missing number is : " + missingNumber(array));
    }
}
