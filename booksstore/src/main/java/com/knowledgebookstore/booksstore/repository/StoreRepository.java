package com.knowledgebookstore.booksstore.repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.knowledgebookstore.booksstore.pojo.Book;

@Repository
public class StoreRepository {
    private List<Book> list = Arrays.asList(
        new Book(1, "To Kill a Mockingbird", "Harper Lee", new BigDecimal(10.99), 4.5f),
        new Book(2, "1984", "George Orwell", new BigDecimal(9.99), 4.3f),
        new Book(3, "Pride and Prejudice", "Jane Austen", new BigDecimal(8.99), 4.7f),
        new Book(4, "The Great Gatsby", "F. Scott Fitzgerald", new BigDecimal(7.99), 4.2f),
        new Book(5, "To the Lighthouse", "Virginia Woolf", new BigDecimal(12.99), 4.4f),
        new Book(6, "The Catcher in the Rye", "J.D. Salinger", new BigDecimal(10.99), 4.1f),
        new Book(7, "Moby-Dick", "Herman Melville", new BigDecimal(11.99), 4.6f),
        new Book(8, "The Lord of the Rings", "J.R.R. Tolkien", new BigDecimal(19.99), 4.8f),
        new Book(9, "Jane Eyre", "Charlotte Brontë", new BigDecimal(9.99), 4.5f),
        new Book(10, "One Hundred Years of Solitude", "Gabriel García Márquez", new BigDecimal(13.99), 4.7f),
        new Book(11, "The Hobbit", "J.R.R. Tolkien", new BigDecimal(8.99), 4.4f),
        new Book(12, "Brave New World", "Aldous Huxley", new BigDecimal(9.99), 4.3f),
        new Book(13, "The Odyssey", "Homer", new BigDecimal(7.99), 4.6f),
        new Book(14, "Crime and Punishment", "Fyodor Dostoevsky", new BigDecimal(11.99), 4.5f),
        new Book(15, "The Adventures of Huckleberry Finn", "Mark Twain", new BigDecimal(9.99), 4.4f),
        new Book(16, "Wuthering Heights", "Emily Brontë", new BigDecimal(8.99), 4.2f),
        new Book(17, "The Kite Runner", "Khaled Hosseini", new BigDecimal(10.99), 4.6f),
        new Book(18, "The Alchemist", "Paulo Coelho", new BigDecimal(9.99), 4.3f),
        new Book(19, "Anna Karenina", "Leo Tolstoy", new BigDecimal(12.99), 4.7f),
        new Book(20, "The Picture of Dorian Gray", "Oscar Wilde", new BigDecimal(7.99), 4.1f),
        new Book(21, "The Book Thief", "Markus Zusak", new BigDecimal(10.99), 4.5f),
        new Book(22, "The Chronicles of Narnia", "C.S. Lewis", new BigDecimal(19.99), 4.7f),
        new Book(23, "The Sun Also Rises", "Ernest Hemingway", new BigDecimal(9.99), 4.3f),
        new Book(24, "Gone with the Wind", "Margaret Mitchell", new BigDecimal(12.99), 4.6f),
        new Book(25, "The Secret Life of Bees", "Sue Monk Kidd", new BigDecimal(8.99), 4.2f),
        new Book(26, "The Girl with the Dragon Tattoo", "Stieg Larsson", new BigDecimal(10.99), 4.4f),
        new Book(27, "The Picture of Dorian Gray", "Oscar Wilde", new BigDecimal(7.99), 4.1f),
        new Book(28, "The Fault in Our Stars", "John Green", new BigDecimal(9.99), 4.5f),
        new Book(29, "The Grapes of Wrath", "John Steinbeck", new BigDecimal(11.99), 4.6f),
        new Book(30, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", new BigDecimal(14.99), 4.8f),
        new Book(31, "The Da Vinci Code", "Dan Brown", new BigDecimal(8.99), 4.3f),
        new Book(32, "Frankenstein", "Mary Shelley", new BigDecimal(7.99), 4.4f),
        new Book(33, "The Handmaid's Tale", "Margaret Atwood", new BigDecimal(9.99), 4.5f),
        new Book(34, "The Help", "Kathryn Stockett", new BigDecimal(10.99), 4.7f),
        new Book(35, "The Brothers Karamazov", "Fyodor Dostoevsky", new BigDecimal(11.99), 4.6f),
        new Book(36, "A Game of Thrones", "George R.R. Martin", new BigDecimal(9.99), 4.4f),
        new Book(37, "The Name of the Wind", "Patrick Rothfuss", new BigDecimal(12.99), 4.5f),
        new Book(38, "Beloved", "Toni Morrison", new BigDecimal(8.99), 4.3f),
        new Book(39, "The Road", "Cormac McCarthy", new BigDecimal(10.99), 4.5f),
        new Book(40, "The Count of Monte Cristo", "Alexandre Dumas", new BigDecimal(11.99), 4.6f),
        new Book(41, "The Picture of Dorian Gray", "Oscar Wilde", new BigDecimal(7.99), 4.1f),
        new Book(42, "The Joy Luck Club", "Amy Tan", new BigDecimal(9.99), 4.4f),
        new Book(43, "The Bell Jar", "Sylvia Plath", new BigDecimal(8.99), 4.3f),
        new Book(44, "The Martian", "Andy Weir", new BigDecimal(10.99), 4.5f),
        new Book(45, "The Color Purple", "Alice Walker", new BigDecimal(9.99), 4.6f),
        new Book(46, "A Thousand Splendid Suns", "Khaled Hosseini", new BigDecimal(11.99), 4.7f),
        new Book(47, "The Hobbit", "J.R.R. Tolkien", new BigDecimal(8.99), 4.4f),
        new Book(48, "The Goldfinch", "Donna Tartt", new BigDecimal(12.99), 4.2f),
        new Book(49, "The Catcher in the Rye", "J.D. Salinger", new BigDecimal(10.99), 4.1f),
        new Book(50, "The Hunger Games", "Suzanne Collins", new BigDecimal(9.99), 4.3f),
        new Book(51, "Norwegian Wood", "Haruki Murakami", new BigDecimal(11.99), 4.5f),
        new Book(52, "The Pillars of the Earth", "Ken Follett", new BigDecimal(10.99), 4.6f)
    );

    public List<Book> getBooks(){
        return list;
    }

    public Book getBook(int index){
        return list.get(index);
    }

    public void addBook(Book book){
        list.add(book);
    }

    public void setBook(int index, Book book){
        list.set(index, book);
    }

    public void deleteBook(Book book){
        list.remove(book);
    }
}
