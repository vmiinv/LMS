package kz.sitedev.lms.service.impl;

import kz.sitedev.lms.entity.Req;
import kz.sitedev.lms.repository.ReqRepository;
import kz.sitedev.lms.service.ReqService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReqServiceImpl implements ReqService {
    @Autowired
    ReqRepository reqRepository;
    @Override
    public List<Req> getAll() {
        return reqRepository.findAll();
    }
    public void create(Req req) {
        reqRepository.save(req);
    }

    public Req find(Long id) {
        return reqRepository.findReqById(id);
    }
}
