package org.example;
//Remove HTML Tags: Write a regex to remove all HTML tags from a string.
public class Week04_50 {
    public static void main(String[] args) {
        String htmlTags= Common.getAnyString("write html code : ");
        StringOperation.regexToRemoveHtmlTags(htmlTags);
    }
}
