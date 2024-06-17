package com.knowledgebookstore.booksstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.knowledgebookstore.booksstore.pojo.Book;

public interface StoreRepository extends CrudRepository<Book, Integer>{

}