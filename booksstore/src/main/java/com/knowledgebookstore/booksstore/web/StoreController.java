package com.knowledgebookstore.booksstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgebookstore.booksstore.pojo.Book;
import com.knowledgebookstore.booksstore.service.StoreService;

@RestController
public class StoreController {
    
    @Autowired
    private StoreService service;

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBook(@PathVariable String id){
        return new ResponseEntity<>(service.getBook(id), HttpStatus.OK);
    }

    @GetMapping("/book/allbooks")
    public ResponseEntity<List<Book>> getBooks(){
        return new ResponseEntity<>(service.getBooks(), HttpStatus.OK);
    }
}
