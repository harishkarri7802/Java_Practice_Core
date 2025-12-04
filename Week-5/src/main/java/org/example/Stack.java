package org.example;

import java.util.ArrayList;

public class Stack<T>{

    private  ArrayList<T> stack;

    Stack(){
        stack = new ArrayList<>();
    }

    public void push(T element){
        if(element==null) throw new IllegalArgumentException("element cannot be null");
        stack.add(element);
    }

    public T pop(){
        if(stack.isEmpty()) System.out.println("stack is underflow> there is no element");
        return stack.remove(stack.size()-1);
    }

    public int getStackSize(){
        return stack.size();
    }

}
