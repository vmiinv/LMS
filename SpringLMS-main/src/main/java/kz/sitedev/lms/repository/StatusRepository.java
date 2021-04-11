package kz.sitedev.lms.repository;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {

}
