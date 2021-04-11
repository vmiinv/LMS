package kz.sitedev.lms.repository;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "select * from books where title like %:s% or author like %:s% or description like %:s%", nativeQuery = true)
    List<Book> findBook(String s);
}
