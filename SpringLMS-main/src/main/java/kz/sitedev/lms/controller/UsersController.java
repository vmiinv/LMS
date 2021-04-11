package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.User;
import kz.sitedev.lms.repository.UserRepository;
import kz.sitedev.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> all(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userRepository.findById(id).get();
    }

    @GetMapping("/find/")
    public List<User> getByNameContainingAndAge(@RequestParam String name) {
        return userRepository.findAllByNameContains(name);
    }

    @PostMapping("")
    public User create(@RequestBody User user) {
        return userRepository.saveAndFlush(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id,
                           @RequestBody User user) {
        user.setId(id);
        return userRepository.saveAndFlush(user);
    }

    @PatchMapping("/{id}")
    public User updateUserName(@PathVariable Long id,
                              @RequestParam String name) {
        User user = userRepository.findById(id).get();
        user.setName(name);
        return userRepository.saveAndFlush(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
