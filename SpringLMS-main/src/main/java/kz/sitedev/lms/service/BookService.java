package kz.sitedev.lms.service;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> findBook(String name);
    Book create(Book book);
}
