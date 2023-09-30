package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.Entities.Book;

@Component
public class BookService {
    private static List<Book> books = new ArrayList<Book>();

    static{
        books.add(new Book(1,"C++","Henry"));
        books.add(new Book(2,"java","honey"));
        books.add(new Book(3,"ja","ho"));
    }   

    public List<Book> getAllBooks(){
        return books;
    }
    
    public Book getBook(int id){
        Book book=null;
        for (Book b : books) {
            if(b.getBookId()==id){
                book=b;
                return book;
            }  
        }
        return book;
    }

    public Book form(Book book){
        books.add(book);
        return book;
    }


    public Book update(int id , Book book){
        for (Book b : books) {
            if(b.getBookId()==id){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }    
        }
        return book;
    }



    public void delete(int id){
        for (Book book : books) {
            if(book.getBookId()==id)
              books.remove(book);          
        }
    }
}
