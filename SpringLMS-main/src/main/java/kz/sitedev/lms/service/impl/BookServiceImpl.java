package kz.sitedev.lms.service.impl;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.repository.BookRepository;
import kz.sitedev.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> findBook(String s) {
        return bookRepository.findBook(s);
    }
    public Book create(Book book) {
        return bookRepository.saveAndFlush(book);
    }
}
