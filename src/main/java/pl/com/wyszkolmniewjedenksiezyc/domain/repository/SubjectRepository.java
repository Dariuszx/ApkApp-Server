package pl.com.wyszkolmniewjedenksiezyc.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Subject;

import java.util.List;


public interface SubjectRepository extends CrudRepository<Subject, Long> {

    List<Subject> findByDay(Integer order);
}
