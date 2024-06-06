package com.knowledgebookstore.booksstore.exception;

public class UnableToCreateResourceException extends RuntimeException{
    public UnableToCreateResourceException(String book, int id){
        super("Unable to create resource "+book+", as "+id +" id already exists");
    }
}
