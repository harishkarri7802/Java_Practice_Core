package org.example;

public class BookNotFoundException extends Exception{
    BookNotFoundException(String message){
        super(message);
    }
}
