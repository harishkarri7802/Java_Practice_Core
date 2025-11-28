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

    public static int findTheLargestNumberAmongTheArray(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findSecondLargestElement(int[] array){
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber  = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(firstLargestNumber < array[i]){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = array[i];
            }
        }
        return  secondLargestNumber;
    }

    public static int findThirdLargestElement(int[] array){
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber  = Integer.MIN_VALUE;
        int thirdLargestNumber = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(firstLargestNumber < array[i]){
                secondLargestNumber = firstLargestNumber;
                thirdLargestNumber = secondLargestNumber;
                firstLargestNumber = array[i];
            }
        }
        return  thirdLargestNumber;
    }
}
