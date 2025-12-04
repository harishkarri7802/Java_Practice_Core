package org.example;

import java.util.ArrayList;
import java.util.List;

//Develop a generic method that merges two lists of the same type into a single list.
public class Week05_08 {
    public static void main(String[] args) {
        List<Integer> listOne  = Common.getListIntegerInputFromUser();
        List<Integer> listTwo  = Common.getListIntegerInputFromUser();
        Operations.mergeTwoListOfSameType(listOne,listTwo);
    }
}
