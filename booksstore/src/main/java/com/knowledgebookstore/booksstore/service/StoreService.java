package com.knowledgebookstore.booksstore.service;

import java.util.List;

import com.knowledgebookstore.booksstore.pojo.Book;

public interface StoreService {
    int getIndexByBookName(String bookName);
    int getIndexById(int id);
    Book getBook(int id);
    Book getBook(String bookName);
    void addBook(Book book);
    void updateBook(String bookName, Book book);
    void deleteBook(String bookName);
    List<Book> getBooks();
} 