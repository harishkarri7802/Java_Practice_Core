package org.example;

//String Reversal by Delimiter: Reverse portions of a string separated by a delimiter (e.g., reverse each word in a comma-separated list).
public class Week04_31 {
    public static void main(String[] args) throws InputException {
        String stringValue = Common.getAnyString("Enter a String : ");
        String delimiter = Common.getValidDelemiter("Enter a delimiter (,) : ");
        StringOperation.reversePortionOfStringUsingDelimiter(stringValue,delimiter);
    }
}
