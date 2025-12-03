package org.example;

//Username Validation: Write a regex to validate a username (should only contain alphanumeric characters and be between 5-10 characters long).
public class Week04_48 {
    public static void main(String[] args) {
        String username = Common.getValidStringAndNumber("Enter a username : ");
        StringOperation.regexToValidateUsername(username);
    }
}
