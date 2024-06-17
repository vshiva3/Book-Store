package com.knowledgebookstore.booksstore.service;

import java.util.List;

import com.knowledgebookstore.booksstore.pojo.Book;

public interface StoreService {
    int getIndexByBookName(String bookName);
    Book getBook(String bookName);
    void addBook(Book book);
    // void updateBook(String bookName, Book book);
    void deleteBook(String bookName);
    List<Book> getBooks();
    boolean findIfAvailable(int id);
} 