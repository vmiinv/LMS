package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.Req;
import kz.sitedev.lms.service.ReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reqs")
public class ReqsController {
    @Autowired
    ReqService reqService;

    public List<Req> getAll(){
        return reqService.getAll();
    };

    @PostMapping("")
    public void create(Req req){
        reqService.create(req);
    };

    @GetMapping("/{id}")
    public Req find(@PathVariable("id") Long id){
        return reqService.find(id);
    };

}
