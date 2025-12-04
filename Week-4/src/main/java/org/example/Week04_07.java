package org.example;

//Substring Extraction: Extract a substring from a given string using the substring() method.
public class Week04_07 {
    public static void main(String[] args) throws InputException {
      String value = Common.getValidString("Enter the string value : ");
      int startValue = Common.getValidInteger("Enter the starting index value : ");
      int endValue = Common.getValidInteger("Enter the ending index value : ");
        System.out.println("substring of " + value +" is " + StringOperation.getStringExtraction(value,startValue,endValue));
    }
}
