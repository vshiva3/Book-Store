package com.knowledgebookstore.booksstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgebookstore.booksstore.pojo.Book;
import com.knowledgebookstore.booksstore.service.StoreService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
public class StoreController {
    
    @Autowired
    private StoreService service;


    @GetMapping("/{bookname}")
    public ResponseEntity<Book> getBook(@PathVariable String bookname){
        return new ResponseEntity<>(service.getBook(bookname), HttpStatus.OK);
    }

    @GetMapping("/allbooks")
    public ResponseEntity<List<Book>> getBooks(){
        return new ResponseEntity<>(service.getBooks(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> addBook(@Valid @RequestBody Book book){
        service.addBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // @PutMapping("/{bookname}")
    // public ResponseEntity<Book> updateBook(@Valid @RequestBody Book book, @PathVariable String bookname){
    //     service.updateBook(bookname, book);
    //     return new ResponseEntity<>(service.getBook(bookname), HttpStatus.OK);
    // }

    @DeleteMapping("/{bookname}")
    public ResponseEntity<HttpStatus> deleteBook(@PathVariable String bookname){

        service.deleteBook(bookname);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
