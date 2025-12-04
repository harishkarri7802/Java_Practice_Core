package org.example;

//Join Strings: Join an array of strings into a single string using a delimiter.
public class Week04_22 {
    public static void main(String[] args) {
        String[] arrayString = StringOperation.getStringInputFromUser();
        String delimiter = Common.getValidDelemiter("Enter valid delimiter : ");
        StringOperation.joinArrayOfStringIntoSingleStringUsingDelimiter(arrayString,delimiter);
    }
}
