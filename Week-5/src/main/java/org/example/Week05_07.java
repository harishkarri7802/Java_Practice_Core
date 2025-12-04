package org.example;

//Develop a generic stack class that supports push and pop operations for any data type.
public class Week05_07 {
    public static void main(String[] args) {
       String elementOne = Common.getValidString("Enter element 1 to push to stack (string)");
       String elementTwo = Common.getValidString("Enter element 2 to push to stack (string)");
       Stack<String> stack = new Stack<>();
       stack.push(elementOne);
       stack.push(elementTwo);
        System.out.println("pop element is : " + stack.pop());
    }
}
