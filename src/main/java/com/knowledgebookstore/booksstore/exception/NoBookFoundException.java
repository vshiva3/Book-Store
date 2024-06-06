package com.knowledgebookstore.booksstore.exception;


public class NoBookFoundException extends RuntimeException{
    public NoBookFoundException(String id){
        super("This id '"+id+"' does not exist in our records");
    }
}
