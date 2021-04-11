package kz.sitedev.lms.service.impl;
import kz.sitedev.lms.entity.User;
import kz.sitedev.lms.repository.UserRepository;
import kz.sitedev.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public void create(User user) {
        userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

}
