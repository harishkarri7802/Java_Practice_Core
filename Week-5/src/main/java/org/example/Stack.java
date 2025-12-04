package org.example;

import java.util.ArrayList;

public class Stack<T>{
    private static Integer top =-1;
    private final static Integer size =6;
    private  ArrayList<T> stack = new ArrayList<>();
    public <T> void push(T element){
        if(element==null){
            throw new IllegalArgumentException("element is null");
        }
        if(top >= size){
            throw new IllegalArgumentException("stack overflow...");
        }
//        stack.add(element);
        top++;
    }


}
