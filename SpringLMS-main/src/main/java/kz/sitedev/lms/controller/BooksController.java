package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.User;
import kz.sitedev.lms.repository.BookRepository;
import kz.sitedev.lms.service.BookService;
import kz.sitedev.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    BookService bookService;
    @Autowired
    BookRepository bookRepository;


    @GetMapping("")
    public List<Book> all(){
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookRepository.findById(id).get();
    }

    @GetMapping("/find/")
    public List<Book> getBook(@RequestParam String s){
        return bookService.findBook(s);
    }

    @PostMapping("")
    public Book create(Book book){
        return bookService.create(book);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id,
                           @RequestBody Book book) {
        book.setId(id);
        return bookRepository.saveAndFlush(book);
    }

    @PatchMapping("/{id}")
    public Book updateBookAuthor(@PathVariable Long id,
                              @RequestParam String author) {
        Book book = bookRepository.findById(id).get();
        book.setAuthor(author);
        return bookRepository.saveAndFlush(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookRepository.deleteById(id);
    }
}
