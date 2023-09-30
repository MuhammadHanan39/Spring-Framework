package com.api.book.bootrestbook.ControllerPkg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.Entities.Book;
import com.api.book.bootrestbook.services.BookService;

@RestController
public class BookController {
    
    @Autowired
    BookService bookService;
    
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }


    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBook(id);
    }


    @PostMapping("/books")
    public Book create(@RequestBody Book book){
       
        return  this.bookService.form(book);
    }


    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable("id") int id,@RequestBody Book book){

        return this.bookService.update( id, book);

    }


    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable("id") int id){
            this.bookService.delete(id);
        return "Succesfully deleted";
    }
}
