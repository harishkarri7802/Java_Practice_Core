package org.example;
//Delete an element from an array at a specific position.
public class Week3_18 {

    public static int deleteElementFromArrayAtSpectficPosition(int[] array,int position){
        if(array == null) throw new IllegalArgumentException("array cannot be null ");
        if(position > array.length){
            throw new IllegalArgumentException("position cannot be greater then the array size ");
        }
        if(array.length == 1){
            return array[0];
        }
        for(int i=position;i<array.length;i++){
            array[i-1] = array[position];
        }
        return array[position];
    }
    public static void main(String[] args) {
        int[] array = ArrayOperation.getArrayInputFromUser();
        int position = Common.getValidInteger("Enter the position you want to delete : ");
        int deletedElementFromArray = deleteElementFromArrayAtSpectficPosition(array,position);
        System.out.println("Deleted element from the Array : " + deletedElementFromArray);
        ArrayOperation.displayArrayElement(array);
    }
}
