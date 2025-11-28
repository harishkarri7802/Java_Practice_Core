package org.example;

//Find the duplicate number in an array of n+1 elements.
public class Week3_32 {
    public static void duplicateElementInArray(int []array){
        if( array==null) throw new IllegalArgumentException("Array cannot be null ");
        for(int i=0;i< array.length;i++){
            int element = array[i];
            for(int j=i+1;j<array.length;j++){
                if(element == array[j]){
                    System.out.println("duplicate element is : " + element);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        duplicateElementInArray(array);
    }
}
