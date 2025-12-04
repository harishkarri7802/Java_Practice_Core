package org.example;

//Date Validation: Write a regex to validate a date in the format dd/mm/yyyy.
public class Week04_49 {
    public static void main(String[] args) {
        String date = Common.getValidStringAndNumber("Enter the date in format (dd/mm/yyyy) :");
        StringOperation.regexToValidateDate(date);
    }
}
