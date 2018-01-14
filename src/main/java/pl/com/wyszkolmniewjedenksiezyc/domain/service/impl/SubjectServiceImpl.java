package pl.com.wyszkolmniewjedenksiezyc.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Subject;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.SubjectRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.SubjectService;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public EmbeddedList<Subject> findByDay(Integer day) {
        day = System.currentTimeMillis() % 2 == 0 ? 1 : 2;
        return new EmbeddedList<>(subjectRepository.findByDay(day));
    }
}
