package org.example;

class ArrayOperation {
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
}
