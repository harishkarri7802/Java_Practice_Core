package org.example;

import java.util.ArrayList;

//Implement a method to reverse a List without using the Collections.reverse() method.
// Use loops or recursion to achieve this.
public class Week05_04 {
    public static void main(String[] args) {
        ArrayList<Integer> ans = Common.getListIntegerInputFromUser();
        Operations.reverseList(ans);
        System.out.println(ans);
    }
}
