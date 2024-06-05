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
import org.springframework.web.bind.annotation.RestController;

import com.knowledgebookstore.booksstore.exception.NoBookFoundException;
import com.knowledgebookstore.booksstore.pojo.Book;
import com.knowledgebookstore.booksstore.service.StoreService;

@RestController
public class StoreController {
    
    @Autowired
    private StoreService service;

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBook(@PathVariable int id){
        try{
            return new ResponseEntity<>(service.getBook(id), HttpStatus.OK);
        }catch(NoBookFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
    }

    @GetMapping("/bookbyname/{bookname}")
    public ResponseEntity<Book> getBook(@PathVariable String bookname){
        try{
            return new ResponseEntity<>(service.getBook(bookname), HttpStatus.OK);
        }catch(NoBookFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
    }

    @GetMapping("/book/allbooks")
    public ResponseEntity<List<Book>> getBooks(){
        return new ResponseEntity<>(service.getBooks(), HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity<HttpStatus> addBook(@RequestBody Book book){
        service.addBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/book/{bookname}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable String bookname){
        try{
            service.updateBook(bookname, book);
            return new ResponseEntity<>(service.getBook(bookname), HttpStatus.OK);
        }catch(NoBookFoundException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/book/{bookname}")
    public ResponseEntity<HttpStatus> deleteBook(@PathVariable String bookname){
        try{
            service.deleteBook(bookname);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(NoBookFoundException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
