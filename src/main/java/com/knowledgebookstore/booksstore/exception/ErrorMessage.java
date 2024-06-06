package com.knowledgebookstore.booksstore.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorMessage {
    
    private List<String> message;
    private LocalDateTime timeStamp;

    public ErrorMessage(List<String> message){
        this.timeStamp = LocalDateTime.now();
        this.message = message;
    }

    public void setTimeStamp(){
        this.timeStamp = LocalDateTime.now();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    public LocalDateTime getTimeStamp(){
        return this.timeStamp;
    }

    public List<String> getMessage() {
        return this.message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

}
