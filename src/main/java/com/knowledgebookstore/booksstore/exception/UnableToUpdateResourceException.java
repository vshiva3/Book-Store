package com.knowledgebookstore.booksstore.exception;

public class UnableToUpdateResourceException extends RuntimeException {
    public UnableToUpdateResourceException(String book){
        super("Neither "+book+" is not found nor unable to update");
    }
}
