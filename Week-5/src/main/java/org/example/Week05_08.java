package org.example;

import java.util.ArrayList;
import java.util.List;

//Develop a generic method that merges two lists of the same type into a single list.
public class Week05_08 {
    public static void main(String[] args) {
        System.out.println("Array 1 : ");
        ArrayList<Integer> arrayIntegerOne = Common.getListIntegerInputFromUser();
//        System.out.println("Array 2 : ");
//        ArrayList<Integer> arrayIntegertwo = Common.getListIntegerInputFromUser();
        arrayIntegerOne.stream().forEach(element->{
            System.out.println("element : ");
        });
//        Operations.mergeTwoListOfSameType(arrayIntegerOne,arrayIntegertwo);
    }
}
