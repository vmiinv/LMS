package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.Status;
import kz.sitedev.lms.repository.BookRepository;
import kz.sitedev.lms.repository.StatusRepository;
import kz.sitedev.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    StatusRepository statusRepository;


    @GetMapping("")
    public List<Status> all(){
        return statusRepository.findAll();
    }

    @PostMapping("")
    public Status create(Status status){
        return statusRepository.saveAndFlush(status);
    }

    @PutMapping("/{id}")
    public Status update(@PathVariable Long id,
                           @RequestBody Status status) {
        status.setId(id);
        return statusRepository.saveAndFlush(status);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        statusRepository.deleteById(id);
    }
}
