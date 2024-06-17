package com.knowledgebookstore.booksstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledgebookstore.booksstore.exception.NoBookFoundException;
import com.knowledgebookstore.booksstore.exception.UnableToCreateResourceException;
import com.knowledgebookstore.booksstore.exception.UnableToDeleteResourceException;
import com.knowledgebookstore.booksstore.exception.UnableToUpdateResourceException;
import com.knowledgebookstore.booksstore.pojo.Book;
import com.knowledgebookstore.booksstore.repository.StoreRepository;

@Service
public class StoreServiceImp implements StoreService{

    @Autowired
    private StoreRepository repository;

    @Override
    public List<Book> getBooks() {
        // TODO Auto-generated method stub
        return (List<Book>)repository.findAll();
    }

    @Override
    public int getIndexByBookName(String bookName){
        // TODO Auto-generated method stub
        List<Book> list = getBooks();
        int len = list.size();
        int ind = -1;
        for(int i=0;i<len;i++){
            if(list.get(i).getBookName().toLowerCase().equals(bookName.toLowerCase())){
                ind = i;
            }
        }   

        return ind;
    }

    @Override
    public Book getBook(String bookName){
        // TODO Auto-generated method stub
        int ind = getIndexByBookName(bookName);
        if(ind==-1){
            throw new NoBookFoundException(bookName);
        }
        return repository.findById(ind+1).get();
    }

    @Override
    public boolean findIfAvailable(int id){
        List<Book> list = getBooks();
        int siz = list.size();

        for(int i=0;i<siz;i++){
            if(list.get(i).getId()==id){
                return true;
            }
        }

        return false;
    }

    @Override
    public void addBook(Book book) {
        // TODO Auto-generated method stub
        boolean val = findIfAvailable(book.getId());
        if(val == true){
            throw new UnableToCreateResourceException(book.getBookName(), book.getId());
        }

        repository.save(book);
    }

    // @Override
    // public void updateBook(String bookName, Book book){
    //     // TODO Auto-generated method stub
    //     int ind = getIndexByBookName(bookName);
    //     if(ind==-1){
    //         throw new UnableToUpdateResourceException(bookName);
    //     }
    //     repository.setBook(ind, book);
    // }

    @Override
    public void deleteBook(String bookName){
        // TODO Auto-generated method stub
        int ind = getIndexByBookName(bookName);
        if(ind==-1){
            throw new UnableToDeleteResourceException(bookName);
        }
        repository.delete(getBook(bookName));
    }


    
}
