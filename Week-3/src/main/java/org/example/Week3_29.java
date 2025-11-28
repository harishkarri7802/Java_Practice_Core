package org.example;

//Check if an array is a palindrome (same forwards and backwards).
public class Week3_29 {
    public static boolean isArrayPalindrome(int array[]){
        if(array == null) throw new IllegalArgumentException("Array cannot be null ");
        if(array.length%2 ==0){
            System.out.println(array.length);
            return false;
        }
        int i=0;
        int j = array.length-1;
        while(i<j){
            System.out.println(array[i] + " : " + array[j]);
            if(array[i] != array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        boolean isPalindrome  = isArrayPalindrome(array);
        if(isPalindrome){
            System.out.println("Yes.given array is palindrome ");
        }else {
            System.out.println("No.given array is palindrome ");
        }
    }
}
