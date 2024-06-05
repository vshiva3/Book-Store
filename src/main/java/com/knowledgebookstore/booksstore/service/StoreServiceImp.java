package com.knowledgebookstore.booksstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledgebookstore.booksstore.exception.NoBookFoundException;
import com.knowledgebookstore.booksstore.pojo.Book;
import com.knowledgebookstore.booksstore.repository.StoreRepository;

@Service
public class StoreServiceImp implements StoreService{

    @Autowired
    private StoreRepository repository;

    @Override
    public List<Book> getBooks() {
        // TODO Auto-generated method stub
        return repository.getBooks();
    }

    @Override
    public int getIndexByBookName(String bookName) throws NoBookFoundException{
        // TODO Auto-generated method stub
        List<Book> list = repository.getBooks();
        int len = list.size();
        int ind = -1;
        for(int i=0;i<len;i++){
            if(list.get(i).getBookName().toLowerCase().equals(bookName.toLowerCase())){
                ind = i;
            }
        }

        if(ind==-1){
            throw new NoBookFoundException();
        }

        return ind;
    }

    @Override
    public int getIndexById(int id) throws NoBookFoundException{
        // TODO Auto-generated method stub
        List<Book> list = repository.getBooks();
        int ind = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                ind = i;
            }
        }

        if(ind==-1){
            throw new NoBookFoundException();
        }
        return ind;
    }

    @Override
    public Book getBook(int id) throws NoBookFoundException{
        // TODO Auto-generated method stub
        return repository.getBook(getIndexById(id));
    }

    @Override
    public Book getBook(String bookName) throws NoBookFoundException{
        // TODO Auto-generated method stub
        return repository.getBook(getIndexByBookName(bookName));
    }

    @Override
    public void addBook(Book book) {
        // TODO Auto-generated method stub
        repository.addBook(book);
    }

    @Override
    public void updateBook(String bookName, Book book) throws NoBookFoundException{
        // TODO Auto-generated method stub
        int ind = getIndexByBookName(bookName);
        repository.setBook(ind, book);
    }

    @Override
    public void deleteBook(String bookName) throws NoBookFoundException{
        // TODO Auto-generated method stub
        
        repository.deleteBook(getBook(bookName));
    }


    
}