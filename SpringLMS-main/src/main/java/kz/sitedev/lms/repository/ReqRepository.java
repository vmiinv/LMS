package kz.sitedev.lms.repository;

import kz.sitedev.lms.entity.Req;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReqRepository extends JpaRepository<Req, Long> {

    List<Req> findAll();
    List<Req> findByStatusId(Long id);
    List<Req> findByUserId(Long id);
    List<Req> findByBookId(Long id);
    Req findReqById(Long id);

}
