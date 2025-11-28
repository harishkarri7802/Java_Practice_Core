package org.example;

//Find the sum of all elements in an array.

public class Week3_02 {

    public static int getTheSumOfArray(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
        sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        System.out.println(" sum of element : "  + getTheSumOfArray(array));



    }

}
