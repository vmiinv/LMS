package kz.sitedev.lms.repository;

import kz.sitedev.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();
    List<User> findAllByNameContains(String name);
}
