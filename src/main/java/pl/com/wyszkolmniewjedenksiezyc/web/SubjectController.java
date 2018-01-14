package pl.com.wyszkolmniewjedenksiezyc.web;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Subject;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.SubjectService;

@RestController
@RequestMapping("/api/subject")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SubjectController {

    private final SubjectService subjectService;

    @RequestMapping(value = "/{day}", method = RequestMethod.GET)
    public EmbeddedList<Subject> findByDay(@PathVariable("day") Integer day) {
        return subjectService.findByDay(day);
    }
}
