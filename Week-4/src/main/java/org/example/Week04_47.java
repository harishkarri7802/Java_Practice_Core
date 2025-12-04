package org.example;

//IP Address Validation: Write a regex to validate an IPv4 address.
public class Week04_47 {
    public static void main(String[] args) {
        String ipAddress = Common.getNumberAndDot("Enter a IP Address : ");
        StringOperation.regexToValidateIpAddress(ipAddress);
    }
}
