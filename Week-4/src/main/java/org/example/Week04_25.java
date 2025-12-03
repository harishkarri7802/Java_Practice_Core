package org.example;
//Longest Common Prefix: Find the longest common prefix among an array of strings.
public class Week04_25 {
    public static void main(String[] args) {
      String[] arrayString = StringOperation.getStringInputFromUser();
        System.out.println("longest common prefix : " + StringOperation.findLongestCommonPrefixWithinString(arrayString));
    }
}
