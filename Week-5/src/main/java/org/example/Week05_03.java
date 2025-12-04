package org.example;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

//Write a program that takes a list of numbers with possible duplicates and returns a list of unique numbers using a HashSet.
// Also, demonstrate how to convert a Set back to a List.
public class Week05_03 {
    public static void main(String[] args) {
        List<Integer> list = Common.getListIntegerInputFromUser();
        Operations.convertListIntoSet(list);
    }
}
