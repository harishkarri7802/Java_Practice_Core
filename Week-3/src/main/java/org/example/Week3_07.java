package org.example;

//Check if an array contains a specific value.

public class Week3_07 {
    public static boolean isvalueContainInArray(int array[],int key){
        if(array ==null) throw new IllegalArgumentException("Array cannot be null");
        for(int i =0;i<array.length;i++){
            if(array[i] != key){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        int key = Common.getValidInteger("Enter the value .you want to search : ");
        if(isvalueContainInArray(array,key)){
            System.out.println("Yes. value is contained in the array");
        }else{
            System.out.println("no,value does not contain in the array");
        }
    }
}
