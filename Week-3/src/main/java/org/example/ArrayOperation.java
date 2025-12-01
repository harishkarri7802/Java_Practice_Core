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

    public static boolean checkArrayIsPalindrme(int[] array){
        if(array==null) throw new IllegalArgumentException("array cannot be null");

        int start = 0;
        int end = array.length-1;
        while(start < end){
            if(array[start] != array[end]){
                return false;
            }
        }
        return true;
    }

    public static void splitArray(int[] array){
        if(array==null){
            throw new IllegalArgumentException("Array cannot be null");
        }
        int n = array.length /2;
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[(array.length-n)+1];
        for(int i=0;i<n;i++){
            firstHalf[i] =array[i];
        }
        for(int i=n+1;i<array.length;i++){
            secondHalf[n-i] = array[i];
        }
        System.out.println("First Half ");
        ArrayOperation.displayArrayElement(firstHalf);
        System.out.println("Second Half ");
        ArrayOperation.displayArrayElement(secondHalf);
    }


}
