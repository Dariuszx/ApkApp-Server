package pl.com.wyszkolmniewjedenksiezyc.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Quest;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.QuestService;

@RestController
@RequestMapping("/api/quest")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuestController {

    private final QuestService questService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Quest findOne(@PathVariable("id") Long id) {
        return questService.find(id);
    }
}
