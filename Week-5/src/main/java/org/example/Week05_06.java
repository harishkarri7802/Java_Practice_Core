package org.example;

//Implement a generic method swap() that takes an array and two indices, and swaps the elements at the given indices.
// Test this method with different data types such as Integer and String.
public class Week05_06 {
    public static void main(String[] args) {
        Integer[] array = Common.getIntegerArrayInputFromUser();
        int indexOne = Common.getValidInteger("Enter a index one : ");
        int indextwo = Common.getValidInteger("Enter a index two : ");
        Operations.swapTwoElement(array,indexOne,indextwo);
    }
}
