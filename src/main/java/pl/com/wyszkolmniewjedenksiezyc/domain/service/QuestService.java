package pl.com.wyszkolmniewjedenksiezyc.domain.service;

import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Quest;

public interface QuestService {

    EmbeddedList<Quest> findAll();
    Quest find(Long id);
}
