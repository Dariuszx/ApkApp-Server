package pl.com.wyszkolmniewjedenksiezyc.domain.service;


import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Subject;

public interface SubjectService {

    EmbeddedList<Subject> findByDay(Integer day);
}
