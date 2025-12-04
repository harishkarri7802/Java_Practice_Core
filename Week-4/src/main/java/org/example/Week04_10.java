package org.example;

//String Comparison: Compare two strings lexicographically (using compareTo() method).
public class Week04_10 {
    public static void main(String[] args) {
      String valueOne = Common.getValidString("Enter the String value 1 : ");
      String valueTwo = Common.getValidString("Enter the String value 2 : ");
        System.out.println("comapre : " + valueOne.compareTo(valueTwo));
    }
}
