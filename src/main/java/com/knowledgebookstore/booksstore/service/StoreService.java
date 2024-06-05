package com.knowledgebookstore.booksstore.service;

import java.util.List;

import com.knowledgebookstore.booksstore.exception.NoBookFoundException;
import com.knowledgebookstore.booksstore.pojo.Book;

public interface StoreService {
    int getIndexByBookName(String bookName) throws NoBookFoundException;
    int getIndexById(int id) throws NoBookFoundException;
    Book getBook(int id) throws NoBookFoundException;
    Book getBook(String bookName) throws NoBookFoundException;
    void addBook(Book book);
    void updateBook(String bookName, Book book) throws NoBookFoundException;
    void deleteBook(String bookName) throws NoBookFoundException;
    List<Book> getBooks();
} 