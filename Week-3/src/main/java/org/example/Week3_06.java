package org.example;
//Count the occurrences of a specific element in an array.
public class Week3_06 {
    public static int countNumberOccurencesOfElement(int[] array,int key){
        int count=0;
        for(int i =0;i<array.length-1;i++){
            if(array[i]==key){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = ArrayOperation.getArrayInputFromUser();
        int key = Common.getValidInteger("Enter your number that you want to count : ");
        int numberOfOccurences = countNumberOccurencesOfElement(arr,key);
        System.out.println("number of occurences of "+ key + " is " + numberOfOccurences);
    }
}
