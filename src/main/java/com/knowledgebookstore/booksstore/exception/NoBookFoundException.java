package com.knowledgebookstore.booksstore.exception;


public class NoBookFoundException extends RuntimeException{
    public NoBookFoundException(String book){
        super("This id '"+book+"' does not exist in our records");
    }
}
