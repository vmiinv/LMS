package kz.sitedev.lms.service;


import kz.sitedev.lms.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAll();
    void create(User user);
}
