package com.knowledgebookstore.booksstore.customvalidators;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.knowledgebookstore.booksstore.pojo.Book;
import com.knowledgebookstore.booksstore.service.StoreService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BookExistsLogic implements ConstraintValidator<CheckIfBookExists, String>{

    @Autowired
    private StoreService storeService;


    public BookExistsLogic() {
    }

    
    public BookExistsLogic(StoreService storeService) {
        this.storeService = storeService;
    }

    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        List<Book> list = storeService.getBooks();
        // TODO Auto-generated method stub
        for(Book book:list){
            if(book.getBookName().equalsIgnoreCase(value)){
                return false;
            }
        }
        return true;
    }
}
