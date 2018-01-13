package pl.com.wyszkolmniewjedenksiezyc.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Quest;

import java.util.List;

public interface QuestRepository extends CrudRepository<Quest, Long> {

    List<Quest> findAll();
    Quest findById(Long id);
}