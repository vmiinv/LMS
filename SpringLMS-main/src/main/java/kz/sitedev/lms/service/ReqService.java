package kz.sitedev.lms.service;

import kz.sitedev.lms.entity.Req;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReqService {
    List<Req> getAll();
    void create(Req req);
    Req find(Long id);
}
