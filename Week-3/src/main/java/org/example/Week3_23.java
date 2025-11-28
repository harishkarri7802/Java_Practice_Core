package org.example;
//Check if two arrays are equal.
public class Week3_23 {

    public static boolean isTwoArrayEqual(int[] arrayOne,int[] arrayTwo){
        if(arrayOne == null || arrayTwo ==null){
            throw new IllegalArgumentException("array cannot be null ");
        }
        if(arrayOne.length != arrayTwo.length){
            return false;
        }
        if(arrayOne == arrayTwo){
            return true;
        }
        int i=0;
        int j=0;
        while(i < arrayOne.length && j < arrayTwo.length){
            if(arrayOne[i] != arrayTwo[i]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
       int[] arrayOne  = ArrayOperation.getArrayInputFromUser();
       int[] arrayTwo = ArrayOperation.getArrayInputFromUser();
       boolean isEqual = isTwoArrayEqual(arrayOne,arrayOne);

       if(isEqual){
           System.out.println("arrays are equal ");
       }else {
           System.out.println("arrays are not  equal ");
       }
    }
}
