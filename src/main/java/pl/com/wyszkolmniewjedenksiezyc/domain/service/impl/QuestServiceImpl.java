package pl.com.wyszkolmniewjedenksiezyc.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Quest;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.QuestRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.QuestService;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuestServiceImpl implements QuestService {

    private final QuestRepository questRepository;

    @Override
    public EmbeddedList<Quest> findAll() {
        return new EmbeddedList<>(questRepository.findAll());
    }

    @Override
    public Quest find(Long id) {
        id = System.currentTimeMillis() % 2 == 0 ? 1L : 2L;
        return questRepository.findById(id);
    }
}
