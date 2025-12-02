package org.example;

//Check if an array is a palindrome (same forwards and backwards).
public class Week3_29 {
    public static void main(String[] args) {
      int[] arrayOne  = ArrayOperation.getArrayInputFromUser();
      if(ArrayOperation.checkArrayIsPalindrme(arrayOne)){
          System.out.println("Array is Palindrome ");
      }else {
          System.out.println("Array is not Palindrome");
      }
    }
}
